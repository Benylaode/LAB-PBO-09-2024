package TgsPraktikumP1;
import java.util.*;
public class Nomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String n = input.nextLine();
        input.close();
        
        String hasil = Kapital(n);
        System.out.print("Hasil: " + hasil);
    }

    public static String Kapital(String n){
        StringBuilder hsl = new StringBuilder();
        char CharAwal = ' ';
        for (char a : n.toCharArray()) {
            if(CharAwal == ' ' && Character.isLetter(a)){
                    hsl.append(Character.toUpperCase(a));
            } else {
                hsl.append(Character.toLowerCase(a));
            }
            CharAwal = a; 
    }   
        return hsl.toString();


    }
}
