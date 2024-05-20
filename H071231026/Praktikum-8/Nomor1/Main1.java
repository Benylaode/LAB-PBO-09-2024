import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    private static int jumlahData = 4;
    private static int jumlahBot = 3;
    private static int berhasil;
    private static int gagal;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        System.out.println(String.format("Start Load %d data", jumlahData));

        ExecutorService executorPribadi = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(jumlahBot);
        UiThread ui = new UiThread();

        executorPribadi.execute(ui);

        for (int i = 1; i <= jumlahData; i++) {
            Bot bot = new Bot();
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

        synchronized (lock) {
            if (berhasil == jumlahData) {
                System.out.println("All Data Is Successfully Loaded");
            } else {
                System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));
            }
        }
    }

    public static void dataBerhasil() {
        synchronized (lock) {
            berhasil++;
        }
    }

    public static void dataGagal() {
        synchronized (lock) {
            gagal++;
        }
    }
}

class Bot extends Thread {
    public void run() {
        int waktuEksesuki = TaskTimeHelper.getTaskExecutionTime();
        if (waktuEksesuki < 5) {
            try {
                Thread.sleep(waktuEksesuki * 1000);
                Main.dataBerhasil();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            Main.dataGagal();
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
                synchronized (Main.lock) {
                    if (Main.gagal > 0) {
                        System.out.println("request time out");
                        Main.gagal = 0;
                    }
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
