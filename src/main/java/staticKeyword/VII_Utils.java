/**
 * Добавь в Utils метод static void printHello(String name)
 * и вызови его прямо в main без создания объекта.
 */
package staticKeyword;

public class VII_Utils {
    static void printHello(String name){
        System.out.printf("Hello %s!%n", name);
    }

    public static void main(String[] args) {
        String name = "Hanna";
        VII_Utils.printHello(name);
    }
}
