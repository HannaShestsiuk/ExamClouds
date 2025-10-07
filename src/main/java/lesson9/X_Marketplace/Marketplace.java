package lesson9.X_Marketplace;

public class Marketplace {
    public static void main(String[] args) {
        // products
        Product p1 = new Product("Milk", 3.5, 4.7);
        Product p2 = new Product("Cheese", 20, 4.5);
        Product p3 = new Product("Cake", 29.3, 4.6);
        Product p4 = new Product("Bread", 4.2, 4.8);

        // categories
        Category dairy = new Category("Dairy", new Product[]{p1, p2});
        Category bakery = new Category("Bakery", new Product[]{p3, p4});

        // baskets
        Basket basket1 = new Basket(new Product[]{p1, p2, p3});
        Basket basket2 = new Basket(new Product[]{p1, p3, p4});

        // users
        User user1 = new User("John", basket1);
        User user2 = new User("Piter", basket2);

        System.out.println("Products:");
        System.out.println(dairy);
        System.out.println(bakery);

        System.out.println();

        System.out.println("Users' purchase:");
        System.out.println(user1);
        System.out.println(user2);
    }
}
