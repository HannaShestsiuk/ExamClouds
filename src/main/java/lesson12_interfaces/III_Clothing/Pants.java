package lesson12_interfaces.III_Clothing;

public class Pants extends Clothing implements MenClothing, WomenClothing{
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's Pants:");
        printInfo();
    }

    @Override
    public void dressWoman() {
        System.out.print("Women's Pants");
        printInfo();
    }
}
