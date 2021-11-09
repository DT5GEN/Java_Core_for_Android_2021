package HomeWork06;

public class Cat extends Animal {
    protected static int numberOfCats = 0;
    private final int CAT_RUN_DISTANCE_LIMIT = 220;
    private final int CAT_SWIM_DISTANCE_LIMIT = 0;

    public Cat(String name) {
        super(name);
        super.setRunDistance(CAT_RUN_DISTANCE_LIMIT);
        super.setSwimDistance(CAT_SWIM_DISTANCE_LIMIT);
        numberOfCats++;
    }

    public Cat(String name, int runDistanceLimit, int swimDistanceLimit) {
        super(name, runDistanceLimit, swimDistanceLimit);
        numberOfCats++;
    }


    public void swim(int distance) {
        System.out.println("\nКошка не умеет плавать");
    }


}
