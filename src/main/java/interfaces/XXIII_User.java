/**
 * Интерфейс Printable с методом printInfo().
 * Создай User implements Printable и выведи имя и возраст.
 */
package interfaces;

public class XXIII_User implements XXIII_Printable{
    private String name;
    private int age;

    public XXIII_User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.printf("Name: %s; Age: %d", name, age);
    }

    public static void main(String[] args) {
        XXIII_User user = new XXIII_User("Adam", 33);
        user.printInfo();
    }
}
