package Tugas1;

public abstract class Hewan {
    protected int legs;
    protected String makanan;

    public Hewan(int legs, String makanan){
        this.legs = legs;
        this.makanan = makanan;
    }
    public abstract int getNumberOfLegs();
    public abstract String getFavoriteFood();
}
