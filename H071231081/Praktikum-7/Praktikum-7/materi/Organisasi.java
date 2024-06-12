package materi;
public class Organisasi extends Kehidupan{
    String organisasi;
    public Organisasi(String organisasi) {
        this.organisasi = organisasi;
    }

    public String getOrganisasi() {
        return organisasi;
    }

    public void setOrganisasi(String organisasi) {
        this.organisasi = organisasi;
    }

    @Override
    void prosesKehidupan() {
       System.out.println("organisasi: "+getOrganisasi());
    }


    
}
