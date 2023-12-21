// Strategy interface
interface CompressionStrategy {
    void compress(String file);
}

// Concrete strategy classes
class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String file) {
        System.out.println("Compressing file " + file + " using Zip compression.");
        // Zip compression logic
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String file) {
        System.out.println("Compressing file " + file + " using Rar compression.");
        // Rar compression logic
    }
}

class TarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String file) {
        System.out.println("Compressing file " + file + " using Tar compression.");
        // Tar compression logic
    }
}

// Context class
class FileCompressor {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFile(String file) {
        compressionStrategy.compress(file);
    }
}

// User interface
public class CompressionApp {
    public static void main(String[] args) {
        // Create instances of concrete strategies
        CompressionStrategy zipStrategy = new ZipCompressionStrategy();
        CompressionStrategy rarStrategy = new RarCompressionStrategy();
        CompressionStrategy tarStrategy = new TarCompressionStrategy();

        // Create context
        FileCompressor fileCompressor = new FileCompressor();

        // Set and use different compression strategies
        fileCompressor.setCompressionStrategy(zipStrategy);
        fileCompressor.compressFile("document.txt");

        fileCompressor.setCompressionStrategy(rarStrategy);
        fileCompressor.compressFile("image.jpg");

        fileCompressor.setCompressionStrategy(tarStrategy);
        fileCompressor.compressFile("data.csv");
    }
}