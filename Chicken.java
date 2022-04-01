package Tugas1;

public class Chicken extends Hewan{
    public Chicken(int legs, String makanan) {
        super(legs, makanan);
    }

    @Override
    public int getNumberOfLegs() {
        return this.legs;
    }

    @Override
    public String getFavoriteFood() {
        return this.makanan;
    }
}
