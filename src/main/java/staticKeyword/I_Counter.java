/**
 * Создай класс Counter с полем static int total.
 * При каждом вызове конструктора увеличивай total.
 * Выведи в main, сколько всего создано объектов.
 */
package staticKeyword;

public class I_Counter {
    static int total;

    public I_Counter(){
        total++;
    }

    public static void main(String[] ags){
        I_Counter counter1 = new I_Counter();
        I_Counter counter2 = new I_Counter();
        I_Counter counter3 = new I_Counter();

        System.out.printf("Total counters created: %d", total);
    }
}
