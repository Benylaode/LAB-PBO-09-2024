public class Pendidikan extends Kehidupan {
    String pendidikan;

    public Pendidikan(String nama, int gaji, String pendidikan) {
        super(nama, gaji);
        this.pendidikan = pendidikan;
    }

    public Pendidikan() {
    }

    @Override
    public void prosesKehidupan() {
        if (pendidikan.equalsIgnoreCase("SD")) {
            System.out.println("Pendidikan Terakhir : SD");
        } else if (pendidikan.equalsIgnoreCase("SMP")) {
            System.out.println("Pendidikan Terakhir : SMP");
        } else if (pendidikan.equalsIgnoreCase("SMK")) {
            System.out.println("Pendidikan Terakhir : SMK");
        } else if (pendidikan.equalsIgnoreCase("SMA")) {
            System.out.println("Pendidikan Terakhir : SMA");
        } else if (pendidikan.equalsIgnoreCase("S1")) {
            System.out.println("Pendidikan Terakhir : S1");
        } else if (pendidikan.equalsIgnoreCase("S2")) {
            System.out.println("Pendidikan Terakhir : S2");
        } else if (pendidikan.equalsIgnoreCase("S2")) {
            System.out.println("Pendidikan Terakhir : S3");
        }
    }

    public static void isiPendidikan() {
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");

    }

    public void pendidikanKaryawan() {
        boolean hentikan = false;
        while (!hentikan) {
            try {
                boolean a = false;
                while (!a) {
                    Pendidikan.isiPendidikan();
                    this.pendidikan = sc.nextLine();

                    if (pendidikan.equalsIgnoreCase("SD")) {
                        this.nilaiPlus = 0;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("SMP")) {
                        this.nilaiPlus = 0;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("SMK")) {
                        this.nilaiPlus = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("SMA")) {
                        this.nilaiPlus = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("S1")) {
                        this.nilaiPlus = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("S2")) {
                        this.nilaiPlus = 1;
                        hentikan = true;
                        a = true;
                    } else if (pendidikan.equalsIgnoreCase("S3")) {
                        this.nilaiPlus = 1;
                        hentikan = true;
                        a = true;
                    } else {
                        System.out.println("Pilihan hanya (SD/SMP/SMA/SMK/S1/S2/S3)");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Menerima Angka");
                sc.nextLine();
            }
        }
    }
}