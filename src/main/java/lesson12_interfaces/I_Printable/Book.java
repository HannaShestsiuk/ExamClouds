package lesson12_interfaces.I_Printable;

public class Book implements Printable {
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public void print() {
        System.out.println(bookName);
    }

    //static method to return books' name
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                ((Book) item).print();
            }
        }
    }
}
