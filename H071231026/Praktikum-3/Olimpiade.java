import java.util.ArrayList;

public class Olimpiade {
    String name;
    Peserta peserta;
    int year;
    ArrayList<Peserta> pesertas;

    public Olimpiade() {
    }

    public Olimpiade(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Olimpiade(String name, Peserta peserta, int year) {
        this.name = name;
        this.peserta = peserta;
        this.year = year;
    }

    public void setListPeserta(ArrayList<Peserta> pesertas) {
        this.pesertas = pesertas;
    }

    public void displayPemenang() {
        Peserta bestPeserta = this.pesertas.get(0);
        for (Peserta peserta : this.pesertas) {
            if (peserta.getScore() > bestPeserta.getScore()) {
                bestPeserta = peserta;
            }
        }

        System.out.println("================= The Winner ==================");
        System.out.println("Name    : " + bestPeserta.getName());
        System.out.println("Score   : " + bestPeserta.getScore());
        System.out.println("City    : " + bestPeserta.getCity());
    }

    public void displayOlimpiadeInfo() {
        System.out.println("============ Olympics Information =============");
        System.out.println("Name        : " + this.getName());
        System.out.println("Year        : " + this.getYear());
        System.out.println("Participant : ");
        for (Peserta peserta : this.pesertas) {
            System.out.println("Name    : " + peserta.getName());
            System.out.println("City    : " + peserta.getCity());
            System.out.println("------------------------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Peserta> getPesertas() {
        return pesertas;
    }

    public void setPesertas(ArrayList<Peserta> pesertas) {
        this.pesertas = pesertas;
    }
}