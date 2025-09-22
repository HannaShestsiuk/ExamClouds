package lesson9.X_Marketplace;

import java.util.Arrays;

public class Basket {
    Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public String toString() {
        return Arrays.toString(products);
    }
}
