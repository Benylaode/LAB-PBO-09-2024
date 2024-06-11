package tgspraktikump3;

public class Mainkuli {
        public static void main(String[] args) {
            Prokuli javaisdakey = new Prokuli();
            javaisdakey.setnama("Agus");
            javaisdakey.setboostingan(0);;

            Prokuli lawan = new Prokuli("Lawan Kuli", "Kuli Cina", 0);
    
            int jumlahPertandingan = 2;
    
            for (int i = 0; i < jumlahPertandingan; i++) {
                System.out.println("\nPertandingan ke-" + (i + 1));
                
                
                if (i == 1) {  
                    javaisdakey.boostingan(2);
                    lawan.boostingan(60); 
    
                }

                javaisdakey.adupasheng(lawan);

            }
    }
    
}
