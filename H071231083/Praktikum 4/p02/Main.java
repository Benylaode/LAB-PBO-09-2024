public class Main {
    public static void main(String[] args) {
        AcaraOlahraga acara1 = new AcaraOlahraga();
        acara1.setName("Pertempuran Bola Basket Bintang");
        acara1.setDurasi(120);
        acara1.setPenyiar("Momo");
        acara1.setJenisOlahraga("Bola Basket");
        acara1.setDeskripsi("Acara ini adalah pertandingan antara para pemain basket bintang dari seluruh dunia.");
        acara1.komentar = "Pertandingan basket ini sangat seru";

        acara1.displayInfo();
        System.out.println();

        AcaraOlahraga acara2 = new AcaraOlahraga("Pertempuran Sepak Bola Legenda", 120, "Sarah mimi", "Sepak Bola",
                "Acara ini adalah pertandingan ekslusif antara tim tim legenda kelas dunia.");
        System.out.println("Nama            : " + acara2.getName());
        System.out.println("Durasi          : " + acara2.getDurasi() + " menit");
        System.out.println("Penyiar         : " + acara2.getPenyiar());
        System.out.println("Jenis Olahraga  : " + acara2.getJenisOlahraga());
        System.out.println("Deskripsi       : " + acara2.getDeskripsi());

        SelfUtils.displaySelfData();
    }
}
