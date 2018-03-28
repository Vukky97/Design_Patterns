package stategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
    private CompressionStrategy mCompressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        mCompressionStrategy = compressionStrategy;
    }

    public void createArchive(ArrayList<File> files) {
        mCompressionStrategy.compressFiles(files);
    }
}
