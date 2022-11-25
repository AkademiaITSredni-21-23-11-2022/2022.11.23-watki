package pl.it.akademia.watki.inkrementacja;

public class IncrementatorThread implements Runnable {

    Incrementator incrementator;

    public IncrementatorThread(Incrementator incrementator) {
        this.incrementator = incrementator;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            /*synchronized (App.lock) {
                App.counter++;
            }*/
            incrementator.increment();
        }
    }

    /*private synchronized void increment() {
        App.counter++;
    }*/
}
