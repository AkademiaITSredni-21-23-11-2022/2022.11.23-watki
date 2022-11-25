package pl.it.akademia.watki.inkrementacja;

public class App {

    public volatile static int counter = 0;
    public static int counter2 = 0;
    public final static Object lock = new Object();
    public final static Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {

        /*for(int i = 0; i < 5000; i++) {
            counter++;
        }*/

        Incrementator incrementator = new Incrementator();

        Thread t1 = new Thread(new IncrementatorThread(incrementator));
        Thread t2 = new Thread(new IncrementatorThread(incrementator));
        Thread t3 = new Thread(new IncrementatorThread(incrementator));
        Thread t4 = new Thread(new IncrementatorThread(incrementator));
        Thread t5 = new Thread(new IncrementatorThread(incrementator));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println(counter);
    }
}
