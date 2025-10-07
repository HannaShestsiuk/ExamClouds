/**
 * Интерфейс Printable
 * 1. Определить интерфейс Printable, содержащий метод void print().
 * 2. Определить класс Book, реализующий интерфейс Printable.
 * 3. Определить класс Magazine, реализующий интерфейс Printable.
 * 4. Создать массив типа Printable, который будет содержать книги и журналы.
 * 5. В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 * 6. Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 *      который выводит на консоль названия только журналов.
 * 7. Создать статический метод printBooks(Printable[] printable) в классе Book,
 *      который выводит на консоль названия только книг. Используем оператор instanceof.
 */
package lesson12_interfaces.I_Printable;

public class Main {
    public static void main(String[] args) {
        // create array with books and magazines
        Printable[] printables = new Printable[4];
        printables[0] = new Book("The Lord of The Ring");
        printables[1] = new Book("The Originals the Art of War");
        printables[2] = new Magazine("Men's");
        printables[3] = new Magazine("New York Times");

        // print() for each item within printables
        System.out.println("Print all: ");
        for (Printable item : printables) {
            item.print();
        }
        System.out.println();
        System.out.println("Print magazines:");
        Magazine.printMagazines(printables);

        System.out.println();
        System.out.println("Print books:");
        Book.printBooks(printables);
    }
}
