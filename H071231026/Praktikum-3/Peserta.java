public class Peserta {
    String name;
    int age;
    String city;
    double score;

    public Peserta() {
    }

    public Peserta(String name, int age, String city, double score) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.score = score;
    }

    public void displayPesertaInfo() {
        System.out.println("=========== Participant Information ===========");
        System.out.println("Name    : " + this.getName());
        System.out.println("Age     : " + this.getAge());
        System.out.println("City    : " + this.getCity());
        System.out.println("Score   : " + this.getScore());
    }

    public void upgradeScore(double score) {
        this.setScore(score);
        System.out.printf("%s has upgraded score to: %.1f in final \n", this.getName(), score);
    }

    public void winnerScore() {
        if (this.getScore() >= 900) {
            System.out.println(this.getName() + " is the winner of the olympiad.");
        } else if (this.getScore() >= 800) {
            System.out.println(this.getName() + " achieved the 2nd place.");
        } else if (this.getScore() >= 700) {
            System.out.println(this.getName() + " achieved the 3rd place.");
        } else {
            System.out.println(this.getName() + " did not make it to the top 3.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}