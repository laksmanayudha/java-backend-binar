package Tugas1;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        String terbalik = "";
        for(int i = kalimat.length()-1; i >= 0; i--){
            terbalik += String.valueOf(kalimat.charAt(i));
        }
        System.out.println("Kalimat terbalik: " + terbalik);
    }
}
