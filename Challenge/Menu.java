package Tugas1.Challenge;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Menu {
    public static void main(String[] args) throws IOException {
        do{
            int menu = menuChoice();
            if(menu <= 0) break;

            if(menu == 1){
                if(isFileExists()){
                    generateModus();
                }
            }else if(menu == 2){
                if(isFileExists()){
                    generateAverageAndMedian();
                }
            }else if(menu ==3){
                if(isFileExists()){
                    generateBoth();
                }
            }else{
                continue;
            }
        }while(isContinue());
    }

    public static boolean isFileExists(){
        String path = "C:\\Users\\ASUS\\IdeaProjects\\TugasBinar\\src\\Tugas1\\Challenge\\data_sekolah.csv";
        if(!new File(path).exists()){
            printMessage("File tidak ditemukan");
            return false;
        }
        return true;
    }

    public static ArrayList<Double> readFile() throws IOException {
        String path = "C:\\Users\\ASUS\\IdeaProjects\\TugasBinar\\src\\Tugas1\\Challenge\\data_sekolah.csv";
        ArrayList<Double> listdata = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        String row;
        while((row = csvReader.readLine()) != null){
            String[] data = row.split(";");

            for(int i = 0; i < data.length; i++){
                if(i == 0 ) continue;
                listdata.add(Double.parseDouble(data[i]));
            }
        }
        Collections.sort(listdata);
        return  listdata;
    }

    public static double getModus(ArrayList<Double> listdata){
        ArrayList<Double> count = new ArrayList<>();
        ArrayList<Double> value = new ArrayList<>();
        for(double number: listdata){
            if(!value.contains(number)){
                value.add(number);
                count.add(0.0);
            }
            int indexValue = value.indexOf(number);
            count.set(indexValue, count.get(indexValue) + 1);
        }

        double max = 0.0;
        for(double number: count){
            if(number > max){
                max = number;
            }
        }
        int index = count.indexOf(max);
        return value.get(index);
    }

    public static double getMedian(ArrayList<Double> listdata){
        int size = listdata.size();
        boolean odd = size % 2 == 0 ? false : true;
        if(odd){
            int midIndex = (int) Math.ceil(size/2);
            return listdata.get(midIndex);
        }else{
            int firsttMidIndex = (int) Math.floor(size/2);
            int secondtMidIndex = (int) Math.ceil(size/2);
            return (listdata.get(firsttMidIndex) + listdata.get(secondtMidIndex))/2;

        }
    }

    public static void generateBoth() throws IOException {
        generateModus();
        generateAverageAndMedian();
    }

    public static void  generateAverageAndMedian() throws IOException {
        ArrayList<Double> listdata = readFile();
        double sum = 0.0;
        for(double value: listdata){
            sum += value;
        }

        double mean = sum / listdata.size();
        double modus = getModus(listdata);
        double median = getMedian(listdata);

        // write to txt
        String generatedPath = "C:\\Users\\ASUS\\IdeaProjects\\TugasBinar\\src\\Tugas1\\Challenge\\data_sekolah_modus_median.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(generatedPath));
        writer.write("Berikut Hasil Pengolahan Nilai:\n\n");
        writer.write("Berikut hasil sebaran data nilai\n");
        writer.write("Mean: " + mean + "\n");
        writer.write("Median: " + median + "\n");
        writer.write("Modus: " + modus + "\n");
        writer.close();

        printMessage("File telah di generate di " + generatedPath + "\nSilahkan cek.");
    }

    public static void generateModus() throws IOException{
        double lessThan = 6;
        double totalLessThan = 0;
        ArrayList<Double> listdata = readFile();
        ArrayList<Double> count = new ArrayList<>();
        ArrayList<Double> value = new ArrayList<>();
        for(double number: listdata){
            if(!value.contains(number)){
                value.add(number);
                count.add(0.0);
            }
            int indexValue = value.indexOf(number);
            count.set(indexValue, count.get(indexValue) + 1);
        }

        for(int i = 0; i < value.size(); i++){
            if(value.get(i) < lessThan){
                totalLessThan += count.get(i);
            }
        }

        // write to txt
        String generatedPath = "C:\\Users\\ASUS\\IdeaProjects\\TugasBinar\\src\\Tugas1\\Challenge\\data_sekolah_modus.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(generatedPath));
        writer.write("Berikut Hasil Pengolahan Nilai:\n\n");
        writer.write("Nilai\t\t\t|\tFrekuensi\n");
        writer.write("kurang dari 6\t\t|\t" + totalLessThan + "\n");
        for(int i = 0; i < value.size(); i++){
            if(value.get(i) < lessThan) continue;
            writer.write(value.get(i)+ "\t\t\t|\t" + count.get(i) + "\n");
        }
        writer.close();
        printMessage("File telah di generate di " + generatedPath + "\nSilahkan cek.");
    }

    public static void printMessage(String message){
        System.out.println();
        System.out.println();
        System.out.println("====================================");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("====================================");
        System.out.println(message);
    }

    public static int menuChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("====================================");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("====================================");
        System.out.println("Letakan csv dengan nama file data_sekolah di direktori berikut C:\\Users\\ASUS\\IdeaProjects\\TugasBinar\\src\\Tugas1\\Challenge");
        System.out.println();
        System.out.println("pilih menu:");
        System.out.println("1. Generate txt untuk menampilkan modus");
        System.out.println("2. Generate txt untuk menammpilkan nilai rata-rata, median");
        System.out.println("3. Generate kedua file");
        System.out.println("0. Exit");
        System.out.print("pilihan anda: ");
        int menu = input.nextInt();
        return menu;
    }

    public static boolean isContinue(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("0 Exit");
        System.out.println("1 Kembali ke menu utama");
        System.out.print("Pilihan: ");
        boolean exit = input.nextInt() > 0 ? false : true;
        if(exit) {
            return false;
        }else{
            return  true;
        }
    }
}
