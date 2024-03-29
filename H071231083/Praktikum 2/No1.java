public class No1 {
    private String name; //class yg bertipe string, int, dan boolean
    private int age;
    private boolean isMale; //private untuk mengontrol akses terhadap atribut atau metode dalam sebuah kelas. artinya hanya dapat diakses oleh anggota dalam kelas yg sama
    
    public No1(String name, int age, boolean isMale) { //konstruktor
        this.name = name; //this.name merujuk pada atribut name dari objek, sedangkan name merujuk pada parameter dari konstruktor
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name; //mengatur nilai atribut name
    }

    public String getName() {
        return name; //mengembalikan nilai atribut name
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() { //mengembalikan jenis kelamin seseorang. jika true maka male jika false maka female
        return isMale ? "Male" : "Female"; // ?kondisi jika nilai true atau false
    }

    public static void main(String[] args) {
        No1 person = new No1("San", 19, true); //objek
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("Gender : " + person.getGender());
    }
}