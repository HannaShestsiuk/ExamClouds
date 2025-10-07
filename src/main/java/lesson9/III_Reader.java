/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * - ФИО,
 * - номер читательского билета,
 * - факультет,
 * - дата рождения,
 * - телефон.
 * - Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 *  Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */
package lesson9;

public class III_Reader {
    private String fullName;
    private int readerId;
    private String facility;
    private String birthDate;
    private String phoneNumber;

    public III_Reader(String fullName,
                      int readerId,
                      String facility,
                      String birthDate,
                      String phoneNumber) {
        this.fullName = fullName;
        this.readerId = readerId;
        this.facility = facility;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public III_Reader() {
    }

    public III_Reader(String fullName) {
        this.fullName = fullName;
    }

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Book() {
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    // takeBook methods
    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(fullName + " взял книги: " + String.join(", ", books));
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
        System.out.println();
    }

    // returnBook methods
    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(fullName + " вернул книги: " + String.join(", ", books));
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        III_Reader[] readers = {
                new III_Reader("James Bond"),
                new III_Reader("John Smith")
        };

        Book b1 = new Book("Приключения", "Автор1");
        Book b2 = new Book("Словарь", "Автор2");
        Book b3 = new Book("Энциклопедия", "Автор3");

        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(b1, b2, b3);

        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(b1, b2, b3);
    }
}
