public abstract class Dog { //dog adalah sebuah kls abstrak yg memiliki 2 atribut position dan averageLength
    public int position;
    public int averageLength;

    void move(){};  //ada 2 method abstrak yg harus diimplementasikan oleh kls turunannya yaitu move dan describe
    abstract void describe(); //metod move digunakan utk mengubah posisi dog dan metod describe utk mendeskripsikan karakteristik dog
}

//kelas turunan
class Pitbull extends Dog { //ada 4 kls yg merupakan turunan dari kls dog : pitbull, siberianhusky, Buldog, dan GermanSheperd
    @Override     // masing masing kls anak memiliki implementasi yg spesifik utk metod move dan describe sesuai dgn jenis anjignya
    void move() { //implementasi metod move utk setiap kls anak memperbarui posisi anjing dan mencetak pesan yg sesuai dgn pergerakan
        this.position += 3;
        System.out.printf("Pitbull berpindah ke kanan (+3): %d", this.position);
    }

    @Override
    void describe() { //implementasi metod describe utk setiap kls anak memperkenalkan jenis anjing dan karakternya
        System.out.println(
                "Pitbull: Pitbulls biasanya memiliki tubuh yang berotot, kepala yang lebar dengan rahang yang kuat, telinga yang tegak, dan bulu yang pendek dan rapat. Mereka biasanya memiliki tubuh yang kompak dan kuat, dengan kaki yang kokoh.");
    }
}

class SiberianHusky extends Dog {
    @Override
    void move() { //metod move utk memindahkan posisi anjing ke kanan dgn jumlah langkah yg berbeda beda tergantung pada jenis anjingnya
        this.position += 2;
        System.out.printf("Siberian Husky berpindah ke kanan (+2): %d", this.position);
    }

    @Override
    void describe() { //metod describe utk mencetak deskripsi tentang jenis anjing
        System.out.println(
                "Siberian Husky: Siberian Husky memiliki bulu tebal dengan dua lapisan, telinga tegak, dan ekor berbulu tebal yang sering membentuk seperti lingkaran. Mereka memiliki tubuh yang proporsional dengan kaki yang kuat, mata biru atau cokelat, serta wajah yang menarik dengan ekspresi yang penuh semangat.");
    }
}

class Bulldog extends Dog {
    @Override
    void move() {
        this.position += 1;
        System.out.printf("\nBulldog berpindah ke kanan (+1): %d", this.position);
    }

    @Override
    void describe() {
        System.out.println(
                "Bulldog: Memiliki tubuh yang pendek, berotot, kepala besar dengan rahang yang kuat, dan hidung yang pendek. Telinga kecil dan lipatan kulit di wajah. Bulu pendek dan rapat.");
    }
}

class GermanShepherd extends Dog {
    @Override
    void move() {
        this.position += 3;
        System.out.printf("\nGerman Shepherd berpindah ke kanan (+3): %d", this.position);
    }

    @Override
    void describe() {
        System.out.println(
                "German Shepherd: Memiliki tubuh yang pendek, berotot, kepala besar dengan rahang yang kuat, dan hidung yang pendek. Telinga kecil dan lipatan kulit di wajah. Bulu pendek dan rapat.");
    }
}
