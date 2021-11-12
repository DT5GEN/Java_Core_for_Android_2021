package HomeWork07;

import java.util.Random;

public class Cat {

    private String name;
    Random random = new Random();

    private final int MAX_FULLNESS_OF_THE_TANK =  random.nextInt(3) +5;

    private int fullness;

    public Cat (String name){
        this.name = name;
    }

    public void fullnessOfTheTank (Dish dish) {
        int appetite = Math.max(MAX_FULLNESS_OF_THE_TANK - fullness - random.nextInt(5), 0);

        int foodCount = dish.getFoodCount();
        if (foodCount - appetite >= 0){
        dish.nyamNyamFood(appetite);
        fullness = MAX_FULLNESS_OF_THE_TANK;
    } else {
            dish.nyamNyamFood(foodCount);
            fullness += foodCount;
        }
    }

    public boolean isFullness(){
        return fullness == MAX_FULLNESS_OF_THE_TANK;
    }

    public String getName() {
        return name;
    }
}
