import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static int jumlahData = 4;
    private static int jumlahBot = 3;
    private static int dataGagal;
    public static int dataBerhasil;
    public static boolean gagal = false;
    public static ConcurrentLinkedQueue<String> messagesQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        System.out.println(String.format("Start Load %d data", jumlahData));

        ExecutorService executorPribadi = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(jumlahBot);
        UiThread ui = new UiThread();

        for (int i = 1; i <= jumlahData; i++) {
            Bot bot = new Bot();
            executorPribadi.execute(ui);
            executor.execute(bot);

        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }
        ui.stopProgram();
        executorPribadi.shutdown();
        while (!executorPribadi.isTerminated()) {

        }

        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");

        if (dataBerhasil == jumlahData) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int dataGagal = 4 - dataBerhasil;
            System.out.println(
                    String.format("%d Data Successfully loaded & %d Data failed to load", dataBerhasil, dataGagal));

        }

    }

    public static synchronized void dataBerhasil() {
        dataBerhasil++;
    }
}

class Bot extends Thread {

    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime();

        try {
            if (waktuEksesuki > 4) {
                Thread.sleep(5000);
                Main.gagal = true;
                Main.messagesQueue.add("Request Timeout");
            } else {
                Thread.sleep(waktuEksesuki * 1000);
                Main.dataBerhasil();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Main.gagal = true;
        }
    }

}

class UiThread extends Thread {
    private boolean yes = true;
    public static int jumlah;

    @Override
    public void run() {
        while (yes) {
            try {
                jumlah++;
                Thread.sleep(1000);
                System.out.println(String.format("Loading... (%ds)", jumlah));
                String message;
                while ((message = Main.messagesQueue.poll()) != null) {
                    System.out.println(message);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stopProgram() {
        yes = false;
    }

}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}
