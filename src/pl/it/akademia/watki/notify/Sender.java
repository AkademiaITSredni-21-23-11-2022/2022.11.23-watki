package pl.it.akademia.watki.notify;

public class Sender implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Nadawca sie odpalil !!!");
            Thread.sleep(1000);
            System.out.println("Nadawca cos robi !!!");
            Thread.sleep(1000);
            System.out.println("Nadawca nadal cos robi !!!");
            Thread.sleep(1000);
            System.out.println("Nadawca wysyla !!");
            synchronized (App.communicationChannel) {
                App.flag = true;
                App.message = "nadawca juz skonczyl !!";
                App.communicationChannel.notifyAll();
            }
            System.out.println("Nadawca wyslal !!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
