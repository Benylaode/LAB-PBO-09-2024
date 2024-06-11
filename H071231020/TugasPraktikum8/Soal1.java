import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Kelas pembantu untuk memberikan waktu eksekusi acak untuk tugas
class TaskTimeHelper {
    private static final Random random = new Random();

    // Metode untuk mendapatkan waktu eksekusi acak antara 1 hingga 6 detik
    public static int getRandomExecutionTime() {
        return random.nextInt(6) + 1;
    }
}

class Soal01 {
    // Penghitung untuk data yang berhasil dimuat dan gagal dimuat
    private static int dataLoadedCount = 0;
    private static int dataFailedCount = 0;
    // Variabel untuk menyimpan waktu mulai proses
    private static long startTime;
    // Total jumlah tugas data yang akan dijalankan
    private static final int data = 4;
    // Variabel untuk melacak waktu yang telah berlalu
    private static long time;
    // Antrian untuk menyimpan pesan-pesan untuk pembaruan UI
    private static ConcurrentLinkedQueue<String> messagesQueue = new ConcurrentLinkedQueue<>();

    // Tugas Runnable untuk thread UI untuk memperbarui antarmuka pengguna
    static Runnable runnableForUIThread = new Runnable() {
        @Override
        public void run() {
            // Atur waktu mulai
            startTime = System.currentTimeMillis();
            // Loop tak terbatas untuk terus memperbarui UI
            while (true) {
                // Hitung waktu yang telah berlalu
                time = (System.currentTimeMillis() - startTime) / 1000;
                if (time > 0) {
                    // Cetak pesan pemuatan dengan waktu yang telah berlalu
                    System.out.println("Loading... (" + time + "s)");
                    String message;
                    // Proses dan cetak semua pesan dalam antrian
                    while ((message = messagesQueue.poll()) != null) {
                        System.out.println(message);
                    }
                    // Sinkronisasi untuk memeriksa apakah semua tugas data selesai
                    synchronized (Soal01.class) {
                        if (dataLoadedCount + dataFailedCount == data) {
                            // Cetak ringkasan ketika semua tugas selesai
                            System.out.println();
                            System.out.println("Task Finish.");
                            System.out.println("Time Execution : " + time + "s");
                            if (dataFailedCount > 0) {
                                System.out.println(dataLoadedCount + " Data Successfully loaded & " + dataFailedCount
                                        + " Data failed to load");
                            } else {
                                System.out.println("All data is successfully loaded");
                            }
                            // Keluar dari loop
                            break;
                        }
                    }
                }
                try {
                    // Tidur selama 1 detik sebelum pembaruan berikutnya
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    // Tugas Runnable untuk thread latar belakang untuk mensimulasikan pemuatan data
    static Runnable runnableForBackgroundThread = new Runnable() {
        public void run() {
            // Dapatkan waktu eksekusi acak untuk tugas
            int executionTime = TaskTimeHelper.getRandomExecutionTime();
            boolean success = true;
            try {
                // Simulasikan eksekusi tugas, gagal jika memakan waktu lebih dari 4 detik
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
            // Sinkronisasi untuk memperbarui penghitung dan pesan
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

    /**
     * Metode utama untuk memulai program
     * @param args
     */
    public static void main(String[] args) {
        // Jumlah thread pekerja latar belakang
        int backgroundThreads = 3;
        // Jumlah thread UI
        int uiThreads = 1;
        // Layanan eksekutor untuk thread latar belakang
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
        // Layanan eksekutor untuk thread UI
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        System.out.println("Start load " + data + " Data");

        // Eksekusi thread UI
        executorForUIThread.execute(runnableForUIThread);
        // Eksekusi thread latar belakang untuk tugas pemuatan data
        for (int i = 0; i < data; i++) {
            executorForBackgroundThread.execute(runnableForBackgroundThread);
        }
        // Matikan layanan eksekutor thread latar belakang
        executorForBackgroundThread.shutdown();
        try {
            // Tunggu semua tugas latar belakang selesai
            executorForBackgroundThread.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Matikan layanan eksekutor thread UI
        executorForUIThread.shutdown();
    }
}
