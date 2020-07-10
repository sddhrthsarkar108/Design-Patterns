package ofp;

import oop.context.Compressor;
import oop.strategy.GzipCompressionStrategy;
import oop.strategy.ZipCompressionStrategy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Client {
    public static void main(String[] args) throws IOException {
        Compressor compressor = new Compressor((os) -> new GZIPOutputStream(os));
        // avoids creating multiple strategy classes
        compressor.compress(Paths.get("README.md"), new File(""));

        compressor.setStrategy(ZipOutputStream::new);
        compressor.compress(Paths.get("README.md"), new File(""));
    }
}
