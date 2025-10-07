package lesson9.X_Marketplace;

import java.util.Arrays;

public class Category {
    String name;
    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String toString() {
        return name + ": " + Arrays.toString(products);
    }
}
