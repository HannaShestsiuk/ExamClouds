/**
 * Создай класс ConfigReader с приватным конструктором
 * и статическим методом read(String key).
 * Попробуй вызвать new ConfigReader() — не должно работать.
 */
package accessModifiers;

public class XIV_ConfigReader {
    private XIV_ConfigReader() {
        System.out.println("Private ConfigReader constructor called.");
    }

    public static String read(String key){
        return switch (key) {
            case "username" -> "user@123";
            case "nickname" -> "testUser";
            default -> "Unknown key";
        };
    }
}
