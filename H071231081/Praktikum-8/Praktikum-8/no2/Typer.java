package no2;

class Typer extends Thread {
    String botName;
    String wordsTyped;
    double wpm;
    TypeRacer typeRacer;
    
    public Typer(String botName, int wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }
    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsType() {
        return wordsTyped;
    }

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    } 

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
public void run() {
    String[] wordsToType = typeRacer.getWordsToType().split(" ");
// todo 1
// todo2
// todo 3
    for (String word : wordsToType) {

        try {
            long timePerWord = (long) (60000.0 / wpm);
            Thread.sleep(timePerWord);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Add word to wordsTyped
        addWordsTyped(word);
    }

    double totalWordsTyped = wordsTyped.split(" ").length;
    double totalTime = totalWordsTyped / wpm * 60000;
    this.addWordsTyped("(selesai)");
    TypeRacer.addResult(new Result(botName, totalTime));
}
}



    
