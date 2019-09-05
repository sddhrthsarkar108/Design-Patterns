package structural;

interface File {
    void save();
    void open();
    void write();
}

class RealFile implements File {
    private String fileName;

    RealFile(String fileName) {
        this.fileName = fileName;
    }

    public void save() {
        System.out.println("SAVING: " + fileName);
    }

    public void open() {
        System.out.println("OPENING: " + fileName);
    }

    public void write() {
        System.out.println("WRITING: " + fileName);
    }
}

// Proxy patterns create a representative object that controls access to another object which may be remote,
// expensive to create or needs security.
// extends subject interface
class ProxyFile implements File {
    // compose subject
    private RealFile realFile;
    private String fileName;

    ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    public void save() {
        if(realFile == null){
            realFile = new RealFile(fileName);
        }
        realFile.save();
    }

    public void open() {
        if(realFile == null){
            realFile = new RealFile(fileName);
        }
        realFile.open();
    }

    public void write() {
        if(realFile == null){
            realFile = new RealFile(fileName);
        }
        realFile.write();
    }
}

public class Proxy {
    public static void main(String[] args) {
        File proxyFile= new ProxyFile("test.txt");
        proxyFile.open();
        proxyFile.write();
        proxyFile.save();
        proxyFile.write();
        proxyFile.save();
    }
}
