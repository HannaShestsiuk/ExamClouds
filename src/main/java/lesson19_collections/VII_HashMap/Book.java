package lesson19_collections.VII_HashMap;

public class Book {
    private String name;
    private double cost;
    private String author;

    public Book(String name, double cost, String author){
        this.name = name;
        this.cost = cost;
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public double getCost(){
        return cost;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return "Book \"" + name + "\" by " + author + " costs " + cost;
    }
}
