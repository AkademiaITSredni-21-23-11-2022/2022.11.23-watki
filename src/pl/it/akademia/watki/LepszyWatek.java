package pl.it.akademia.watki;

public class LepszyWatek implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("Lepszy watek : " + i);
        }
    }
}
