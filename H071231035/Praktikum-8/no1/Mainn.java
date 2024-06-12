package no1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainn {
    private static int jumlahData = 4;
    private static int berhasil;

    public static void main(String[] args) {
        System.out.println(String.format("Star Load %d data", jumlahData));

        ExecutorService executorPribadi1 = Executors.newSingleThreadExecutor();
        ExecutorService executorPribadi2 = Executors.newSingleThreadExecutor();
        UiThread ui = new UiThread();

        for (int i = 0; i < jumlahData; i++) {
            BackgroundThread bot = new BackgroundThread();
            executorPribadi1.execute(ui);
            executorPribadi2.execute(bot);

        }

        executorPribadi2.shutdown();

        while (!executorPribadi2.isTerminated()) {
        }

        ui.stopProgram();
        executorPribadi1.shutdown();
        while(!executorPribadi1.isTerminated()){

        }
        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");
        
        if (berhasil == jumlahData) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int gagal = 4 - berhasil;
            System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));

        }
    }

    public static synchronized void dataBerhasil() {
        berhasil++;
    }
}