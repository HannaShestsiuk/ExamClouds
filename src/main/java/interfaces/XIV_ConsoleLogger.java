/**
 * Интерфейс Logger с методами info() и error().
 * Создай реализацию ConsoleLogger, которая печатает в консоль.
 */
package interfaces;

public class XIV_ConsoleLogger implements XIV_Logger{
    @Override
    public void info(String message) {
        System.out.println("Info: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error: " + message);
    }

    public static void main(String[] args) {
        XIV_ConsoleLogger logger = new XIV_ConsoleLogger();

        logger.info("Result is successful.");
        logger.error("Failed connection.");
    }
}
