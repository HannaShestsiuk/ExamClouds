package lesson12_interfaces.III_Clothing;

public class TShirt extends Clothing implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's T-Shirt:");
        printInfo();
    }

    @Override
    public void dressWoman() {
        System.out.println("Women's T-Shirt:");
        printInfo();
    }
}
