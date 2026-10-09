package strategy.problem06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String target = "documents.tar";
        FileArchiver archiver = new FileArchiver(new ZipCompression());

        System.out.println("--- Archiving with ZIP ---");
        archiver.archiveFile(target);

        System.out.println("\n--- Switching to GZIP ---");
        archiver.setStrategy(new GzipCompression());
        archiver.archiveFile(target);

        System.out.println("\n--- Batch archiving with RAR ---");
        archiver.setStrategy(new RarCompression());
        archiver.archiveBatch(Arrays.asList("notes.txt", "project.db", "backup.sql"));
    }
}
