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
        fullness = Math.max(fullness - random.nextInt(4),0);
        int appetite = MAX_FULLNESS_OF_THE_TANK - fullness;
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
