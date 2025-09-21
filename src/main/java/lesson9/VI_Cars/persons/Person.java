package lesson9.VI_Cars.persons;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "\nФИО: " + fullName;
    }
}
