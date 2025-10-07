/**
 * Цветы
 * 1. Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * 2. Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * 3. Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
 * 4. Также подсчитать количество проданных цветов (используем статическую переменную).
 */
package lesson10_static.I_flowers;

public class Bouquet {
    static Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    static double getCost(){
        double totalCost = 0.0;
        for (Flower flower : flowers){
            totalCost += flower.cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Flower rose1 = new Rose(5.0);
        Flower rose2 = new Rose(5.5);
        Flower rose3 = new Rose(5.6);
        Flower chamomile1 = new Chamomile(4.2);
        Flower chamomile2 = new Chamomile(3.9);
        Flower lily1 = new Lily(7.4);
        Flower lily2 = new Lily(6.2);
        Flower lily3 = new Lily(6.5);
        Flower lily4 = new Lily(6.9);

        // create 3 bouquets
        Bouquet[] bouquets = new Bouquet[3];

        // create bouquet1
        Flower[] bouquet1 = {rose1, rose2, lily1};
        bouquets[0] = new Bouquet(bouquet1);
        System.out.println("Total cost of bouquet 1: " + getCost());

        // create bouquet2
        Flower[] bouquet2 = {chamomile1, chamomile2, lily2};
        bouquets[1] = new Bouquet(bouquet2);
        System.out.println("Total cost of bouquet 2: " + getCost());

        // create bouquet3
        Flower[] bouquet3 = {lily3, lily4, rose3};
        bouquets[2] = new Bouquet(bouquet3);
        System.out.println("Total cost of bouquet 3: " + getCost());

        System.out.println("Total number of flowers sold: " + Flower.getSoldCount());
    }
}
