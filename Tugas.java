package Tugas1;

public class Tugas {
    public static void main(String[] args) {
        String nama = "nama saya Ronaldo";
        System.out.println("variabel = " + nama);
        while(true){
            if(nama.equals("")){
                break;
            }
            char countedChar = nama.charAt(0);
            int count = 0;
            if(Character.isWhitespace(countedChar)){
                nama= nama.replaceAll(String.valueOf(countedChar), "");
                continue;
            }
            for(int i = 0; i < nama.length(); i++){
                if(nama.charAt(i) == countedChar){
                    count++;
                }
            }
            System.out.println("alfabet " + countedChar + " muncul " + count + " kali");
            nama= nama.replaceAll(String.valueOf(countedChar), "");
        }
    }
}
