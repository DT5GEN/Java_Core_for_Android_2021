package lesson08.part1;

public class Duck extends Animal implements Running, Flying {

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Duck run!");
    }
}
