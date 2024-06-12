import java.util.ArrayList;
import java.util.Random;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    // Konstruktor untuk menginisialisasi objek Typer dengan nama bot, kecepatan mengetik, dan objek TypeRacer
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    // Setter untuk nama bot
    public void setBotName(String botName) {
        this.botName = botName;
    }

    // Setter untuk kecepatan mengetik (WPM)
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    // Menambahkan kata yang sudah diketik ke variabel wordsTyped
    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    // Getter untuk kata yang sudah diketik
    public String getWordsTyped() {
        return wordsTyped;
    }

    // Getter untuk nama bot
    public String getBotName() {
        return botName;
    }

    // Getter untuk kecepatan mengetik (WPM)
    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        // Menghitung waktu yang dibutuhkan untuk mengetik satu kata (dalam milidetik)
        int howLongToType = (int) (60000 / wpm);

        // Melakukan proses mengetik setiap kata dalam wordsToType
        for (String word : wordsToType) {
            try {
                // Thread tidur sesuai dengan waktu yang dihitung
                Thread.sleep(howLongToType);
                this.addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("(selesai)");

        // Menambahkan hasil ke TypeRacer
        typeRacer.addResult(this);
    }
}

class Result {
    private String name;
    private int finishTime;

    // Konstruktor untuk menginisialisasi objek Result dengan nama dan waktu selesai
    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Setter untuk nama
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk waktu selesai
    public int getFinishTime() {
        return finishTime;
    }

    // Setter untuk waktu selesai
    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private static String wordsToType;

    static ArrayList<Typer> raceContestant = new ArrayList<>();
    static ArrayList<Result> raceStanding = new ArrayList<>();

    // Getter untuk kata-kata yang harus diketik
    public String getWordsToType() {
        return wordsToType;
    }

    // Getter untuk daftar peserta lomba
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // Daftar kata-kata yang bisa dipilih secara acak untuk diketik
    private final static String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampaui nya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    // Mengatur kata-kata baru untuk diketik secara acak dari wordsToTypeList
    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        TypeRacer.wordsToType = wordsToTypeList[angkaRandom];
    }

    // Menambahkan hasil (waktu selesai) ke dalam daftar hasil lomba
    void addResult(Typer typer) {
        int finish_time = (int) (60000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        Result res = new Result(typer.getBotName(), finish_time);
        raceStanding.add(res);
    }

    // Mencetak klasemen akhir berdasarkan hasil lomba
    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=".repeat(200) + "\n");

        for (int i = 0; i < raceStanding.size(); i++) {
            double finishTime = (double) (raceStanding.get(i).getFinishTime());
            double outputDetik = finishTime / 1000;
            System.out
                .println(String.format("%d. %s = %.2f detik", (i + 1), raceStanding.get(i).getName(), outputDetik));
        }
    }

    // Memulai lomba mengetik
    public void startRace() {
        for (Typer i : raceContestant) {
            i.start();
        }

        // Menunggu semua peserta selesai mengetik
        while (true) {
            if (raceStanding.size() != raceContestant.size()) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("\nTyping Progress ...");
                System.out.println("=".repeat(200) + "\n");
                for (Typer j : raceContestant) {
                    System.out.println(" " + j.getBotName() + " => " + j.getWordsTyped());
                }
            } else {
                break;
            }
        }
        // Mencetak klasemen akhir setelah semua peserta selesai
        this.printRaceStanding();
    }
}
