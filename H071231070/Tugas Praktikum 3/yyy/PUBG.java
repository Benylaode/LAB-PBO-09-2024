public class PUBG { 
    String name, rank; // ini atribut 
    int damage;
    int health = 100;
    WeaponAndArmor weaponAndArmor = new WeaponAndArmor(); // disini ko buat objek baru dari kelas lain untuk mengakses atribut sama behavior dari kelas weapon and armor
    // ini juga salah satu syarat dari soal (yang bagian b)

    public PUBG(){ // ini conctructor default, dia ini tidak punya parameter, gunanya supaya bisa buat objek baru tanpa memasukkan parameter, contohnya ada di class main
    }

    public PUBG(String name, String rank, int health) { // karna syarat soalnya harus ada dua constructor, ini constructor keduanya. constructor ini untuk buat objek baru, jadi waktu ko panggil constructornya apapun yang ko masukkan ke dalam kurung itu akan jadi nilainya, contoh ada di class main
        this.name = name;   
        this.rank = rank;
        this.health = health;
    }
    
    public void getPinfo(){ // ini behavior untuk mendapatkan info player
        System.out.println("Nama Player    : " + getName()); // disini dipanggil method getternya untuk menggambil nilai
        System.out.println("Rank Player    : " + getRank()); // kayak getrank ini untuk mengambil nilai rank playernya
        System.out.println("Weapon         : " + weaponAndArmor.getSenjata());    // ini ada kayak weaponAndArmor.getSenjata(), getsenjata itu kan methodnya class weaponandarmor, jadi untuk bisa panggil methodnya harus ko kasih sama2 sama objek yang ko buat diatas tadi "weaponandarmor"
        System.out.println("Armor          : " + weaponAndArmor.getArmor());
        System.out.println("Total Health   : " + getHealth());
    }


    public void weaponAndArmorList(int pilihan1, int pilihan2) { //ini method untuk memilih senjata sama armor, kalau dipanggil nanti pilihanmu ko masukkan kedalam kurung
        if (pilihan1 == 1) { // if else condition misal kalau dia pilih 1
            weaponAndArmor.setSenjata("M416"); //sama kayak tadi karna setsenjata itu methodnya class weaponandarmor jadi harus ko panggil objek yang kobuat tadi
            // method setter itu gunanya untuk mengatur nilai, jadi disini ko atur nilai senjata jadi m416
            setDamage(35);
        } else if (pilihan1 == 2) {
            weaponAndArmor.setSenjata("AKM");
            setDamage(40);
        } else if (pilihan1 == 3){
            weaponAndArmor.setSenjata("UMP");
            setDamage(15);
        } else {
            setDamage(0);
        }

        if (pilihan2 == 1) { // ini if elsenya armor
            weaponAndArmor.setArmor(30);
            setHealth(getHealth() + weaponAndArmor.getArmor());
        } else if (pilihan2 == 2) {
            weaponAndArmor.setArmor(60);
            setHealth(getHealth() + weaponAndArmor.getArmor());
        } else if (pilihan2 == 3) {
            weaponAndArmor.setArmor(100);
            setHealth(getHealth() + weaponAndArmor.getArmor());
        } else {
            weaponAndArmor.setArmor(0);
            setHealth(getHealth() + weaponAndArmor.getArmor());
        }
    }
    

    public void mulaiPertarungan(PUBG musuh) { // ini method untuk mulai pertarungannya, method ini syarat dari soal bagian c, disini kan ada this sama musuh, ingat this ini untuk player 1, musuh yah untuk musuh. karna dalam kurung ada PUBG musuh berarti musuh ini sama kayak player, dia punya health senjata dkk
        while (this.health > 0 && musuh.health > 0) { // ini perulangan while yang dimana kalau healthnya this sama musuh masih lebih dari 0, perulangannya akan terus berlanjut
            // Pemain diserang musuh
            musuh.setHealth(musuh.getHealth() - this.getDamage());; // set itu kan untuk mengatur nilai, get itu untuk ambil nilai, disini karna pemain dulu yg menyerang jadi ko ambil healthnya musuh trus dikurangi damagenya player, healthnya musuh yg terkurung tadi diatur jadi healthnya musuh
            
            // Jika pemain masih hidup, pemain menyerang balik
            if (musuh.health > 0) { 
                this.setHealth(this.getHealth() - musuh.getDamage());; // sama kayak diatas tapi ini musuh yang menyerang
            }
        }
    
        // Menentukan hasil pertarungan
        if (this.health <= 0 && musuh.health <= 0) { // kalau keduanya mati, yang dimana dua dua healthnya 0
            System.out.println("Pertarungan berakhir imbang!");
        } else if (this.health <= 0) { //kalau player mati
            System.out.println(this.name + " kalah dalam pertarungan melawan " + musuh.name);
        } else { // kalau enemy mati
            System.out.println(musuh.name + " kalah dalam pertarungan melawan " + this.name);
        }
    }
    
    //dibawah ini method setter dan getternya
    public String getName() { 
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health + weaponAndArmor.getArmor(); // disini healthnya ditambahi dari banyak nilai dari armor, jadi kalau armornya level 3 tambah banyak healthnya 
    } 
}
