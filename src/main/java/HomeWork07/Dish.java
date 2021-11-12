package HomeWork07;

public class Dish {


    private int foodCount;
    public int getFoodCount() {
        return foodCount;
    }

    public Dish(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printFoodInfo() {
        System.out.println("В миске сейчас " + foodCount + " сосисок.");
    }

    public void nyamNyamFood(int catNyamNyamFood) {

        foodCount -= catNyamNyamFood;

    }

    public void addFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}
