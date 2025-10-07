/**
 * Класс Phone.
 * 1. Создайте класс Phone, который содержит переменные number, model и weight.
 * 2. Создайте три экземпляра этого класса.
 * 3. Выведите на консоль значения их переменных.
 * 4. Добавить в класс Phone методы:
 *      - receiveCall, имеет один параметр – имя звонящего.
 *      Выводит на консоль сообщение “Звонит {name}”.
 *      - getNumber – возвращает номер телефона.
 *      Вызвать эти методы для каждого из объектов.
 * 5. Добавить конструктор в класс Phone,
 *      который принимает на вход три параметра для инициализации переменных класса:
 *      number, model и weight.
 * 6. Добавить конструктор, который принимает на вход два параметра
 *      для инициализации переменных класса - number, model.
 * 7. Добавить конструктор без параметров.
 * 8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * 9. Добавьте перегруженный метод receiveCall, который принимает два параметра:
 *      имя звонящего и номер телефона звонящего. Вызвать этот метод.
 * 10. Создать метод sendMessage с аргументами переменной длины.
 *      Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 *      Метод выводит на консоль номера этих телефонов.
 * 11. Изменить класс Phone в соответствии с концепцией JavaBean.
 */
package lesson9;

public class I_Phone {
    // 1. Создайте класс Phone, который содержит переменные number, model и weight.
    String number;
    String model;
    double weight;

    // 5. Добавить конструктор c тремя параметрами: number, model, weight.
    I_Phone(String number, String model, double weight){
        //this.number = number;
        //this.model = model;
        this(number, model); // 8. вызов конструктора с 2мя пар-ми из конструктора с 3мя пар-ми
        this.weight = weight;
    }

    // 6. Добавить конструктор c двумя параметрами: number, model.
    I_Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    // 7. Добавить конструктор без параметров.
    I_Phone(){
    }

    // 4. Добавить в класс Phone методы: receiveCall, getNumber
    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    String getNumber(){
        return number;
    }

    // 9. Добавьте перегруженный метод receiveCall, который принимает два параметра:
    // *      имя звонящего и номер телефона звонящего
    void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " с номера " + number);
    }

    // 10. Создать метод sendMessage с аргументами переменной длины.
    // *      Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    // *      Метод выводит на консоль номера этих телефонов.

    void sendMessage(String... numbers){
        System.out.print("Send message to : ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("from " + this.number);
    }

    public static void main(String[] args) {
        // 2. Создайте три экземпляра этого класса.
        I_Phone phone1 = new I_Phone();
        phone1.number = "842154111";
        phone1.model = "Samsung";
        phone1.weight = 170.0;

        I_Phone phone2 = new I_Phone();
        phone2.number = "842154222";
        phone2.model = "iPhone";
        phone2.weight = 180.0;

        I_Phone phone3 = new I_Phone();
        phone3.number = "842154333";
        phone3.model = "Pixel";
        phone3.weight = 190.0;

        // 3. Выведите на консоль значения их переменных.
        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        // Вызвать методы receiveCall и getNumber для каждого из объектов.
        phone1.receiveCall("Саша");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Маша");
        System.out.println(phone2.getNumber());

        phone3.receiveCall("Паша");
        System.out.println(phone3.getNumber());

        // 9. Вызвать перегруженный метод receшveCall
        phone1.receiveCall("Даша", phone1.number);

        // 10. Вызвать sendMessage
        phone2.sendMessage("123456789", "789123456", "456789123");

    }
}