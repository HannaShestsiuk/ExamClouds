package lesson12_interfaces.III_Clothing;

public class Tie extends Clothing implements MenClothing{
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's Tie:");
        printInfo();
    }
}
