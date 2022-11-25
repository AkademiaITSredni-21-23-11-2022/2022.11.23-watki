package pl.it.akademia.watki.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Odbiorca odpalony !!");
            System.out.println("Odbiorca czeka !!");

            synchronized (App.communicationChannel) {
                while(!App.flag) {
                    App.communicationChannel.wait();
                }
                App.flag = false;
            }

            System.out.println("Odbiorca odebral sygnal !!");
            System.out.println("Wiadomosc: " + App.message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
