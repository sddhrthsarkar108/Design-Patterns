package structural;

interface MediaPlayer {
    void play(String filename);
}

class MP3 implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
}

interface MediaPackage {
    void playFile(String filename);
}

class MP4 implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
}

class VLC implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
}

// extends target
class FormatAdapter implements MediaPlayer {
    // compose adaptee
    private MediaPackage media;
    public FormatAdapter(MediaPackage m) {
        media = m;
    }
    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}

public class Adapter {
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        // converts the interface of a class into another interface the clients expect.
        // Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }
}
