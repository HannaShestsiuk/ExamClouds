package lesson9.V_StudentAspirant;

public class Student {
    String firstName, lastName, group;
    double avgMark;

    public Student(String firstName,
                   String lastName,
                   String group,
                   double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public Student() {
    }

    public double getScholarship() {
        return avgMark == 5 ? 2000 : 1900;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John",
                "Smith",
                "Group1",
                4.0);
        Student student2 = new Student("Tonny",
                "Brooks",
                "Group1",
                5.0);

        Student[] students = {student1, student2};

        for (Student s : students){
            System.out.println("Стипендия для " + s.firstName + ": " + s.getScholarship());
        }
    }
}
