package HomeWork07;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Parsik");
        Cat cat3 = new Cat("Marsik");

        Dish dish = new Dish(20);

        dish.printFoodInfo();

        Cat[] cats = {cat1, cat2, cat3};

        while (true){

            dish.addFoodCount(3);
            for (Cat cat : cats) {
                cat.fullnessOfTheTank(dish);
                System.out.printf(" %s поел и  полнота желудка равна: %s \n", cat.getName(),cat.isFullness());
            }
dish.printFoodInfo();

            Thread.sleep(4330);


        }



    }
}
