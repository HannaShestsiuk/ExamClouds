package lesson9.VI_Cars.professions;

import lesson9.VI_Cars.persons.Person;

public class Driver extends Person {
    int experience;

    public Driver(String fullName, int experience) {
        super(fullName);
        this.experience = experience;
    }

    public Driver(String fullName) {
        super(fullName);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", стаж вождения: " + experience;
    }
}
