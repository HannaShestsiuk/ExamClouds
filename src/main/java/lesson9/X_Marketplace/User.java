package lesson9.X_Marketplace;

public class User {
    String login;
    String password;
    Basket basket;

    public User(String login, Basket basket) {
        this.login = login;
        this.basket = basket;
    }

    public String toString() {
        return login + ": \n" + basket + "\n";
    }
}
