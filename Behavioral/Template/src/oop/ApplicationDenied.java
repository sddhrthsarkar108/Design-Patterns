package oop;

public class ApplicationDenied extends Exception {
    ApplicationDenied(String reason) {
        super(reason);
    }
}