/**
 * Создать класс Person, который содержит:
 * - переменные fullName, age;
 * - методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * - Добавьте два конструктора  - Person() и Person(fullName, age).
 * - Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 *  -Вызовите методы move() и talk().
 */
package lesson9;

public class II_Person {
    private String fullName;
    private int age;

    public II_Person() {
    }

    public II_Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move(){
        System.out.println(fullName + " идет.");
    }

    public void talk(){
        System.out.println(fullName + " говорит.");
    }

    public static void main(String[] args) {
        // use constructor without parameters
        II_Person person1 = new II_Person();
        person1.setFullName("John Smith"); // used getter and setter
        person1.age = 18; // there are no getter and setter for age

        // use constructor with parameters
        II_Person person2 = new II_Person("James Bond" , 45);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

    }
}
