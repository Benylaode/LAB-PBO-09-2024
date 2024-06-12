import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

class Helper {
    private static final Random random = new Random();

    public static int generateExecutionTime() {
        return random.nextInt(6) + 1;
    }
}

public class DataLoader {
    protected static int sukses = 0;
    protected static int gagal = 0;
    protected static final Object lock = new Object();
    protected static final int totalData = 4;
    protected static long startTime;
    private static ConcurrentLinkedQueue<String> message = new ConcurrentLinkedQueue<>();

    public static class UITask implements Runnable {
        @Override
        public void run() {
            startTime = System.currentTimeMillis();
            while (true) {
                long waktuberlalu = (System.currentTimeMillis() - startTime) / 1000;
                if (waktuberlalu > 0) {
                    System.out.println("Loading... (" + waktuberlalu + "s)");
                    String uiMessage;
                    while((uiMessage = message.poll()) != null) {
                        System.out.println(uiMessage);
                    }
                    synchronized (lock) {
                        if (sukses + gagal == totalData) {
                            System.out.println("\nTask Finished.");
                            System.out.println("Execution Time: " + waktuberlalu + "s");
                            if (gagal > 0) {
                                System.out.println(sukses + " Data Successfully Loaded & " + gagal + " Data Failed to Load");
                            } else {
                                System.out.println("All Data Successfully Loaded");
                            }
                            break;
                        }
                    }
                }
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("UI Thread Interrupted");
                }
            }
        }
    }

    public static class BackgroundTask implements Runnable {
        @Override
        public void run() {
            int execTime = Helper.generateExecutionTime();
            boolean loadSuccess;
            try {
                if (execTime > 4) {
                    Thread.sleep(5000);
                    loadSuccess = false;
                } else {
                    Thread.sleep(execTime * 1000);
                    loadSuccess = true;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Background Thread Interrupted");
                loadSuccess = false;
            }
            synchronized (lock) {
                if (loadSuccess) {
                    sukses++;
                } else {
                    gagal++;
                    message.add("Request Timeout");
                }
            }
        }
    }
}
