import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int backgroundThreads = 3; // pekerja
        int uiThreads = 1;
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        System.out.println("Start load " + DataLoader.totalData + " Data");

        executorForUIThread.execute(new DataLoader.UITask());
        for (int i = 0; i < DataLoader.totalData; i++) {
            executorForBackgroundThread.execute(new DataLoader.BackgroundTask());
        }

        executorForBackgroundThread.shutdown();
        executorForUIThread.shutdown();
        try {
            if (!executorForBackgroundThread.awaitTermination(60, TimeUnit.SECONDS)) {
                executorForBackgroundThread.shutdownNow();
            }
            if (!executorForUIThread.awaitTermination(60, TimeUnit.SECONDS)) {
                executorForUIThread.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorForBackgroundThread.shutdownNow();
            executorForUIThread.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
