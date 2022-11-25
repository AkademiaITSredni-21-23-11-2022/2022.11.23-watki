package pl.it.akademia.watki;

public class Watek extends Thread {

    private int number;

    public Watek(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println(this.number + " : " + i);
        }
    }
}
