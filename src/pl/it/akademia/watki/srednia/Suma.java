package pl.it.akademia.watki.srednia;

public class Suma implements Runnable {
    private int[] tab;
    private int startIndex;
    private int endIndex;

    public Suma(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i = this.startIndex; i < this.endIndex; i++) {
            sum += this.tab[i];
        }
        synchronized (App.partialSums) {
            App.partialSums.add(sum);
        }
    }
}
