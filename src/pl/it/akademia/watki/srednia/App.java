package pl.it.akademia.watki.srednia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class App {
    public final static List<Integer> partialSums = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        int[] tab = new int[100000];

        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = (int) random.nextGaussian(500, 500);
        }

        int sum = 0;
        for(int element : tab) {
            sum += element;
        }

        double avr = ((double) sum) / 100000.0;
        System.out.println(avr);

        Thread t1 = new Thread(new Suma(tab, 0, 25000));
        Thread t2 = new Thread(new Suma(tab, 25000, 50000));
        Thread t3 = new Thread(new Suma(tab, 50000, 75000));
        Thread t4 = new Thread(new Suma(tab, 75000, 100000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        /*while(partialSums.size() != 4) {
            Thread.sleep(100);
        }*/

        int sum2 = 0;
        for(int partialSum: partialSums) {
            sum2 += partialSum;
        }

        double avr2 = sum2 / 100000.0;
        System.out.println(avr2);
    }

    public static int silnia(int x) {
        if(x == 1) {
            return 1;
        }
        return x * silnia(x-1);
    }
}
