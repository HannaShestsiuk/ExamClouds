/**
 * Создать HashMap
 * 1. Создайте HashMap, содержащий пары значений  - имя книги и объект книги (класс Book).
 * 2. Класс Book содержит переменные name, cost, author.
 * 3. Перебрать и распечатать пары значений - entrySet().
 * 4. Перебрать и распечатать набор из имен книг - keySet().
 * 5. Перебрать и распечатать значения книг - values().
 * 6. Для каждого перебора создать свой метод.
 */
package lesson19_collections.VII_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HasMap with books
        Map<String, Book> books = new HashMap<>();
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", 99.99, "Harper Lee"));
        books.put("1984", new Book("1984", 56.99, "George Orwell"));
        books.put("The Great Gatsby", new Book("The Great Gatsby", 84.99, "F. Scott Fitzgerald"));
        books.put("Pride and Prejudice", new Book("Pride and Prejudice", 79.99, "Jane Austen"));

        // Print entries
        printEntries(books);

        // Print keys
        printKeys(books);

        // Print values
        printValues(books);
        }

    // Create a method to print entries - Key : Value
    public static void printEntries(Map<String, Book> map){
        System.out.println("Books' entries:");
        for(Map.Entry<String, Book> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println();
    }

    // Create a method to print book's names
    public static void printKeys(Map<String, Book> map){
        System.out.println("Book names:");
        for (String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();
    }

    // Create a method to print books as an Object
    public static void printValues(Map<String, Book> map){
        System.out.println("Book's Description");
        for (Book book : map.values()){
            System.out.println(book);
        }
        System.out.println();
    }
}