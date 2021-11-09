package HomeWork06;

public abstract class Animal {
    protected static int numberOfAnimals = 0;

    private String name;
    int runDistance;
    int swimDistance;

    public Animal(String name) {
        this(name, 0, 0);
    }

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        numberOfAnimals++;
    }

    public void run(int distance) {

        if (distance < runDistance) {
            System.out.printf("\n%s пробежал %d м.%n", name, distance);
        } else {
            System.out.printf("\n%s не смог пробежать %d м.%n", name, distance);
        }
    }

    public void swim(int distance) {
        if (swimDistance <= 0) {
            System.out.printf("\n%s не умеет плавать.%n", name);
            return;
        }

        if (distance < swimDistance) {
            System.out.printf("\n%s проплыл %d м.%n", name, distance);
        } else {
            System.out.printf("\n%s не смог проплыть %d м.%n", name, distance);
        }
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }


}
