/**
 * Сделай класс AppInfo с константой VERSION = 1.0.
 * Объясни, почему VERSION стоит сделать final static.
 */
package staticKeyword;

public class VII_AppInfo {
    // public - accessed from other classes;
    // static - belongs to the class, not object;
    // final - protected from changes
    public static final String VERSION = "1.0";

    public static void main(String[] args) {
        System.out.println(VERSION);
    }
}
