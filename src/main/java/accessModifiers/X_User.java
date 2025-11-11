/**
 * Создай класс User с приватными полями login, password и публичными геттерами.
 * Выведи логин и пароль.
 */
package accessModifiers;

public class X_User {
    private String login;
    private String password;

    public X_User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return "*".repeat(password.length());
    }

    public static void main(String[] args){
        X_User user1 = new X_User("admin", "password");
        System.out.println("Login: " + user1.getLogin());
        System.out.println("Password: " + user1.getPassword());
    }
}
