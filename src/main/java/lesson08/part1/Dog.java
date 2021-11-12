package lesson08.part1;

public class Dog extends Animal implements Running{




    @Override
    public void run() {
        System.out.println("Dog run!");
    }
}
