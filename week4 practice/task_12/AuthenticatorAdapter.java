package task_12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthenticatorAdapter implements IModernAuthenticator {
    private final LegacyAuthService authService;

    public AuthenticatorAdapter(LegacyAuthService authService) {
        this.authService = authService;
    }

    @Override
    public boolean login(String username, String plainTextPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(plainTextPassword.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            String hexString = sb.toString();
            return authService.authenticateUserHex(username, hexString);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 not supported", e);
        }
    }
}
