package HomeWork06;

public class Dog extends Animal {
    protected static int numberOfDogs = 0;
    private final int DOG_RUN_DISTANCE_LIMIT = 500;
    private final int DOG_SWIM_DISTANCE_LIMIT = 10;

    public Dog(String name) {
        super(name);
        super.setRunDistance(DOG_RUN_DISTANCE_LIMIT);
        super.setSwimDistance(DOG_SWIM_DISTANCE_LIMIT);
        numberOfDogs++;
    }

    public Dog(String name, int dogRunDistanceLimit, int dogSwimDistanceLimit) {
        super(name, dogRunDistanceLimit, dogSwimDistanceLimit);
        numberOfDogs++;
    }


}
