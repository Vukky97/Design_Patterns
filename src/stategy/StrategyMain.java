package stategy;

import java.io.File;
import java.util.ArrayList;

public class StrategyMain {
    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipCompression());
        // empty just for testing purposes
        ArrayList<File> files = new ArrayList<>();
        compressionContext.createArchive(files);
    }
}
