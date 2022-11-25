package pl.it.akademia.watki;

public class App {
    public static void main(String[] args) {
        Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);
        Watek w4 = new Watek(4);
        Watek w5 = new Watek(5);

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();

        Thread t = new Thread(new LepszyWatek());
        t.start();

        //A a = new A();

        System.out.println("koniec maina !!");
    }
}
