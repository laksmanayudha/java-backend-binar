package Tugas1.PR6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TinggiBadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Double> data = new HashMap<>();
        while(true){
            try{
                System.out.print("Tinggi Badan: ");
                data.put("berat", input.nextDouble());
                System.out.print("Berat Badan: ");
                data.put("tinggi", input.nextDouble());

                double bmi = data.get("berat") / Math.pow(data.get("tinggi")/100, 2);
                if(bmi > 30){
                    System.out.println("Anda obesitas");
                }else if(bmi > 25){
                    System.out.println("anda kelebihan berat badan");
                }else if(bmi > 18.5){
                    System.out.println("anda sehat");
                }else{
                    System.out.println("Anda kekurangan berat badan");
                }
            }catch (Exception e){
                System.out.println("Bukan angka");
                input.nextLine();
            }
        }

    }
}
