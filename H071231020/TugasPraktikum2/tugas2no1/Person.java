package TugasPraktikum2.Tugas2No1;

public class Person {
    String name;  // Variabel untuk menyimpan nama
    int age;      // Variabel untuk menyimpan usia
    boolean isMale;  // Variabel untuk menyimpan jenis kelamin (true jika laki-laki, false jika perempuan)

    // Method untuk mengatur nama
    void setName(String name) {
        this.name = name;
    }

    // Method untuk mendapatkan nama
    String getName() {
        return name;
    }

    // Method untuk mengatur usia
    void setAge(int age) {
        this.age = age;
    }

    // Method untuk mendapatkan usia
    int getAge() {
        return age;
    }

    // Method untuk mengatur jenis kelamin
    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    // Method untuk mendapatkan jenis kelamin dalam bentuk teks
    String getGender() {
        return isMale ? "Laki-Laki" : "Perempuan";
    }

    // Metode main untuk pengujian sederhana
    public static void main(String[] args) {
        Person someone = new Person();  // Membuat objek Person baru

        // Mengatur informasi untuk objek Person
        someone.setName("Angga");
        someone.setAge(20);
        someone.setGender(true);

        // Menampilkan informasi tentang objek Person
        System.out.println("================================");
        System.out.println("Nama   : " + someone.getName());
        System.out.println("Usia   : " + someone.getAge());
        System.out.println("Gender : " + someone.getGender());
        System.out.println("================================");
    }
}
