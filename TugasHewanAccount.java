package Tugas1;

public class TugasHewanAccount {
    public static void main(String[] args) {
        Hewan[] arrayHewan = new Hewan[6];
        arrayHewan[0] = new Dog(4, "Daging");
        arrayHewan[1] = new Spider(8, "Serangga");
        arrayHewan[2] = new Fly(0, "Kotoran");
        arrayHewan[3] = new Centipede(100, "Daun");
        arrayHewan[4] = new Snake(0, "Tikus");
        arrayHewan[5] = new Chicken(2, "Kacang");

        for (int i = 0; i < arrayHewan.length; i++){
            System.out.println(arrayHewan[i].getNumberOfLegs());
            System.out.println(arrayHewan[i].getFavoriteFood());
        }
        System.out.println();
        System.out.println(new SavingsAccount("Yudha", "1234", 34.0));

    }
}
