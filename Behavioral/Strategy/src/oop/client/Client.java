package oop.client;

import oop.context.Compressor;
import oop.strategy.GzipCompressionStrategy;
import oop.strategy.ZipCompressionStrategy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException {
        Compressor compressor = new Compressor(new GzipCompressionStrategy());
        compressor.compress(Paths.get("README.md"), new File(""));

        compressor.setStrategy(new ZipCompressionStrategy());
        compressor.compress(Paths.get("README.md"), new File(""));
    }
}
