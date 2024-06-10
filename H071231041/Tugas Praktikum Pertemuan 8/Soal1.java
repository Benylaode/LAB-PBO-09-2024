import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskTimeHelper {
    private static final Random random = new Random();

    public static int getRandomExecutionTime() {
        return random.nextInt(6) + 1;
    }
}

class Soal01 {
    private static int dataLoadedCount = 0;
    private static int dataFailedCount = 0;
    private static long startTime;
    private static final int data = 4; // tugas
    private static long time;
    private static ConcurrentLinkedQueue<String> messagesQueue = new ConcurrentLinkedQueue<>();

    static Runnable runnableForUIThread = new Runnable() {
        @Override
        public void run() {
            startTime = System.currentTimeMillis();
            while (true) {
                time = (System.currentTimeMillis() - startTime) / 1000;
                if (time > 0) {
                    System.out.println("Loading... (" + time + "s)");
                    String message;
                    while ((message = messagesQueue.poll()) != null) {
                        System.out.println(message);
                    }
                    synchronized (Soal01.class) {
                        if (dataLoadedCount + dataFailedCount == data) {
                            System.out.println();
                            System.out.println("Task Finish.");
                            System.out.println("Time Execution : " + time + "s");
                            if (dataFailedCount > 0) {
                                System.out.println(dataLoadedCount + " Data Successfully loaded & " + dataFailedCount
                                        + " Data failed to load");
                            } else {
                                System.out.println("All data is successfully loaded");
                            }
                            break;
                        }
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    static Runnable runnableForBackgroundThread = new Runnable() {
        public void run() {
            int executionTime = TaskTimeHelper.getRandomExecutionTime();
            boolean success = true;
            try {
                if (executionTime > 4) {
                    Thread.sleep(5000);
                    success = false;
                } else {
                    Thread.sleep(executionTime * 1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                success = false;
            }
            synchronized (Soal01.class) {
                if (success) {
                    dataLoadedCount++;
                } else {
                    dataFailedCount++;
                    messagesQueue.add("Request Timeout");
                }
            }
        }
    };

    public static void main(String[] args) {
        int backgroundThreads = 3; // pekerja
        int uiThreads = 1;
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        System.out.println("Start load " + data + " Data");

        executorForUIThread.execute(runnableForUIThread);
        for (int i = 0; i < data; i++) {
            executorForBackgroundThread.execute(runnableForBackgroundThread);
        }
        executorForBackgroundThread.shutdown();
        try {
            executorForBackgroundThread.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorForUIThread.shutdown();
    }
}
