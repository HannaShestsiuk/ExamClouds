package lesson9.VII_Animals;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Here is: " + animal.getName());
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Lucky"),
                new Cat("Kitty"),
                new Bear("Browny")
        };

        Veterinarian vet = new Veterinarian();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

        System.out.println();

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
