package Tugas1;

public class Tugas3 {
    public static void main(String[] args) {
        int number = 9;
        int count = number;
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(j >= count){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }
    }
}
