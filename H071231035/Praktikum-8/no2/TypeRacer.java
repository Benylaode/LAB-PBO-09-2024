package no2;
import java.util.ArrayList;
import java.util.Random;

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    static ArrayList<Result> raceStanding = new ArrayList<>();
    
    public String getWordsToType() {
        return wordsToType;
    }
    
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik", 
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita", 
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas", 
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna", 
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka", 
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri", 
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain", 
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai", 
    };

    public void setNewWordsToType(){
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // todo 4
    public static void addResult(Result result){
        raceStanding.add(result);
    }
    private void printRaceStanding(){
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("===========================");

        // todo 5
        for (int i = 0; i < raceStanding.size(); i++) {
            Result result = raceStanding.get(i);
            System.out.printf("%d. %s = %.2f detik\n", i + 1, result.getName(), result.getFinishTime() / 1000.0);
        }
    }
    void startRace(){
        // todo 6
        for (Typer typer : raceContestant) {
            Thread thread = new Thread(typer);
            thread.start();
        }

        // todo 7
        while (raceStanding.size() < raceContestant.size()) {
            try {
                // Tunggu selama 2 detik
                Thread.sleep(2000);

                // Tampilkan kemajuan
                System.out.println("\nTyping progress...");
                System.out.println("===========================");
                for (Typer typer : raceContestant) {
                    System.out.printf("%s = %s\n", typer.getBotName(),typer.getWordsType());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // todo 8
        raceStanding.sort((r2, r1) -> Double.compare(r2.getFinishTime(), r1.getFinishTime()));
    
        printRaceStanding();
    }
    

}


