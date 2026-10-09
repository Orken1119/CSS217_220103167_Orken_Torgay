package strategy.problem15;

public class WavEncoding implements AudioEncodingStrategy {
    @Override
    public void encode(String audioData) {
        System.out.println("Encoding audio data with WAV (uncompressed 44.1kHz 16-bit PCM): [" + audioData + "]");
    }
}
