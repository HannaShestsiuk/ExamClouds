package lesson9.V_StudentAspirant;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName,
                    String lastName,
                    String group,
                    double avgMark,
                    String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 5 ? 2500 : 2200;
    }

    public static void main(String[] args) {
        Student student = new Student("John",
                "Smith",
                "Group1",
                4.0);
        Aspirant aspirant = new Aspirant("James",
                "Bond",
                "Group2",
                5.0,
                "Agent 007");

        Student[] students = {student, aspirant};

        for (Student s : students){
            System.out.println("Стипендия для " + s.firstName + ": " + s.getScholarship());
        }
    }
}
