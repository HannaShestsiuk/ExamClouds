/**
 * Студенты
 * 1. Создать класс Student, содержащий следующие характеристики:
 *  имя, группа, курс, оценки по предметам.
 * 2. Создать коллекцию, содержащую объекты класса Student.
 * 3. Написать метод, который удаляет студентов со средним баллом <3.
 * 4. Написать метод, который переводит студента на следующий курс, если средний балл>=3.
 * 5. Напишите метод printStudents(Set<Student> students, int course),
 *  который получает список студентов и номер курса.
 *  Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
 */
package lesson19_collections.VIII_Students;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Alice", "A1", 1, 4.5));
        students.add(new Student("Josh", "B2", 2, 2.9));
        students.add(new Student("Scott", "C3", 1, 4.2));
        students.add(new Student("Ryan", "D4", 3, 3.0));

        System.out.println("\nAll students:");
        for (Student s : students) {
            System.out.println(s);
        }

        removeStudentsWithLowAvgMark(students);
        promoteStudentsWithHighAvgMark(students);

        System.out.println("\nThere are students promoted to the next course:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();
        printStudents(students, 2);
    }

    // Remove students with average mark < 3
    public static void removeStudentsWithLowAvgMark(Set<Student> students) {
        students.removeIf(student -> student.getAvgMark() < 3);
    }

    // Promote students with average grade >= 3
    public static void promoteStudentsWithHighAvgMark(Set<Student> students) {
        for (Student student : students) {
            if (student.getAvgMark() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    // Print students of a specific course
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Students on course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
