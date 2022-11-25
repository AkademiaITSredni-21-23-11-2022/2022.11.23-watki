package pl.it.akademia.watki.inkrementacja;

public class Incrementator {
    public synchronized void increment() {
        App.counter++;
    }
}
