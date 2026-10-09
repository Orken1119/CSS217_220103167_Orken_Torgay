package strategy.problem15;

public class OggEncoding implements AudioEncodingStrategy {
    @Override
    public void encode(String audioData) {
        System.out.println("Encoding audio data with OGG Vorbis (open-source variable bitrate): [" + audioData + "]");
    }
}
