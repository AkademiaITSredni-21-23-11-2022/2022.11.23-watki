package pl.it.akademia.watki.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

    public static final Object communicationChannel = new Object();
    public static boolean flag = false;
    public static String message = null;
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);

        executorService.schedule(new Receiver(), 0, TimeUnit.MILLISECONDS);
        executorService.schedule(new Sender(), 5, TimeUnit.SECONDS);

        executorService.shutdown();
    }
}
