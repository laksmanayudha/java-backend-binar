package Tugas1;

public class Snake extends Hewan{

    public Snake(int legs, String makanan) {
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
