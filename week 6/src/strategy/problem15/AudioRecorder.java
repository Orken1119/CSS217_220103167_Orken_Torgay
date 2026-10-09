package strategy.problem15;

public class AudioRecorder {
    private AudioEncodingStrategy strategy;

    public AudioRecorder(AudioEncodingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AudioEncodingStrategy strategy) {
        this.strategy = strategy;
    }

    public void recordAndEncode(String rawAudio) {
        if (strategy == null) {
            System.out.println("No encoding format configured.");
            return;
        }
        System.out.println("Recording audio stream...");
        strategy.encode(rawAudio);
    }
}
