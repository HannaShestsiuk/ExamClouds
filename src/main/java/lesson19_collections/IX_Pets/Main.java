/**
 * Домашние животные
 * 1. Создайте класс Pet с переменной name и абстрактным методом makeNoise().
 * 2. Создать наследников класса Pet - Cat, Dog, Parrot.
 *  Каждый класс реализует свой вариант метода makeNoise().
 * 3. Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 *  а в качестве значения класс Pet.
 * 4. Добавьте в отображение разных животных.
 * 5. Создайте метод выводящий на консоль все ключи отображения.
 * 6. Создайте метод вызывающий метод makeNoise() для каждого животного.
 */
package lesson19_collections.IX_Pets;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Create a Map to store pets by Name
    private Map<String, Pet> pets = new HashMap<>();

    // Add pets to the Map
    public void addPet(Pet pet){
        pets.put(pet.getName(), pet);
    }

    // Create a Method to print pet's names
    public void printPetNames(){
        System.out.println("My pets' names are:");
        for(String name : pets.keySet()){
            System.out.println(name);
        }
    }

    // Create a Method to print pet's noise
    public void printPetNoises(){
        System.out.println("Guess which pets I have by their noise:");
        for(Pet pet : pets.values()){
            pet.makeNoise();
        }
    }

    public static void main(String[] args) {
        Main petList = new Main();

        petList.addPet(new Dog("Lucky"));
        petList.addPet(new Cat("Whiskers"));
        petList.addPet(new Parrot("Polly"));

        petList.printPetNames();
        System.out.println();
        petList.printPetNoises();
    }
}
