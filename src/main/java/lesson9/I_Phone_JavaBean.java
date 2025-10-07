/**
 * 11. Изменить класс Phone в соответствии с концепцией JavaBean.
 */
package lesson9;

public class I_Phone_JavaBean {
    // variables are private
    private String number;
    private String model;
    private double weight;

    I_Phone_JavaBean(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    I_Phone_JavaBean(String number, String model){
        this.number = number;
        this.model = model;
    }

    // JavaBean requires to have constructor without paramaters
    I_Phone_JavaBean(){
    }

    // Getters & Setters for JavaBean
    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // methods should be public for JavaBean
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessage(String... numbers){
        System.out.print("Send message to : ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("from " + this.number);
    }

    public static void main(String[] args) {
        I_Phone_JavaBean phone1 = new I_Phone_JavaBean();
        phone1.number = "842154111";
        phone1.model = "Samsung";
        phone1.weight = 170.0;

        I_Phone_JavaBean phone2 = new I_Phone_JavaBean();
        phone2.number = "842154222";
        phone2.model = "iPhone";
        phone2.weight = 180.0;

        I_Phone_JavaBean phone3 = new I_Phone_JavaBean();
        phone3.number = "842154333";
        phone3.model = "Pixel";
        phone3.weight = 190.0;

        // use getters
        System.out.println(phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println(phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());

        phone1.receiveCall("Саша");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Маша");
        System.out.println(phone2.getNumber());

        phone3.receiveCall("Паша");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Даша", phone1.number);

        phone2.sendMessage("123456789", "789123456", "456789123");
    }
}
