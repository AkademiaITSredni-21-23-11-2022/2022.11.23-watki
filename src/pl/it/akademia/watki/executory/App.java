package pl.it.akademia.watki.executory;

import pl.it.akademia.watki.LepszyWatek;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        /*singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());*/

        singleExecutor.shutdown();

        ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        /*multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());*/

        multiExecutor.shutdown();

        ScheduledExecutorService scheduledExecutor =
                Executors.newScheduledThreadPool(5);

        scheduledExecutor.schedule(new LepszyWatek(), 0, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(), 5, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(), 3, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(), 10, TimeUnit.SECONDS);
        /*scheduledExecutor.schedule(new LepszyWatek(), 1, TimeUnit.MINUTES);
        scheduledExecutor.schedule(new LepszyWatek(), 3, TimeUnit.HOURS);*/

        //Thread.sleep(7000);
        List<Runnable> undone = scheduledExecutor.shutdownNow();
        System.out.println("TEST " + undone.size());
        //scheduledExecutor.shutdown();

    }
}
