package strategy.problem15;

public class Main {
    public static void main(String[] args) {
        String testSample = "VOICE_SAMPLE_001 [duration: 4.5s]";
        AudioRecorder recorder = new AudioRecorder(new Mp3Encoding());

        System.out.println("--- Session 1: Fast podcast recording (MP3) ---");
        recorder.recordAndEncode(testSample);

        System.out.println("\n--- Session 2: Studio master track (WAV) ---");
        recorder.setStrategy(new WavEncoding());
        recorder.recordAndEncode(testSample);

        System.out.println("\n--- Session 3: Web streaming audio (OGG) ---");
        recorder.setStrategy(new OggEncoding());
        recorder.recordAndEncode(testSample);
    }
}
