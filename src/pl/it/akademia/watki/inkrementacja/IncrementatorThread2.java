package pl.it.akademia.watki.inkrementacja;

public class IncrementatorThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            synchronized (App.lock2) {
                App.counter2++;
            }
        }
    }
}
