package lesson12_interfaces.III_Clothing;

public abstract class Clothing {
    Size size;
    double price;
    String color;

    public Clothing(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println("Size = " + size + " (" + size.getEuroSize() +
                "), Description = " + size.getDescription() +
                ", Price = $" + price +
                ", Color = " + color);
    }
}
