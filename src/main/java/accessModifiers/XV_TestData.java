/**
 * Класс TestData имеет публичные поля name и age.
 * Переделай их в private и добавь геттеры.
 * Объясни, зачем так делают.
 */
package accessModifiers;

public class XV_TestData {
    // private variables are NOT accessible outside the declared class
    private String name;
    private int age;

    public XV_TestData(String name, int age){
        this.name = name;
        this.age = age;
    }

    // private variables could be accessed via public getters outside the declared class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
