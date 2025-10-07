package lesson12_interfaces.III_Clothing;

public class Skirt extends Clothing implements WomenClothing{
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Women's Skirt:");
        printInfo();
    }
}
