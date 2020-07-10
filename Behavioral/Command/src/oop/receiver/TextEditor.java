package oop.receiver;

public class TextEditor implements Editor {
    @Override
    public void open() {
        System.out.println("opening text file...");
    }

    @Override
    public void save() {
        System.out.println("saving text file...");
    }

    @Override
    public void close() {
        System.out.println("closing text file...");
    }
}
