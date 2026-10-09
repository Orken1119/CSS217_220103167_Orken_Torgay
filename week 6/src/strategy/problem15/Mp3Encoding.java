package strategy.problem15;

public class Mp3Encoding implements AudioEncodingStrategy {
    @Override
    public void encode(String audioData) {
        System.out.println("Encoding audio data with MP3 (lossy 192kbps CBR compression): [" + audioData + "]");
    }
}
