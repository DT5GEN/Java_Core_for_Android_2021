package HomeWork06;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Пушок", 100, 0),
                new Cat("Баксик", 150, 5),
                new Cat("Васька", 190, 0),
                new Dog("Бобик", 270, 100),
                new Cat("Барсик", 300, 150),
                new Dog("Палкан", 1000, 50)
        };

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(200);
        }

        System.out.println();
        System.out.println("Количество животных: " + Animal.numberOfAnimals + "\n");
        System.out.println("Количество котов: " + Cat.numberOfCats);
        System.out.println("Количество собак: " + Dog.numberOfDogs);
    }
}
