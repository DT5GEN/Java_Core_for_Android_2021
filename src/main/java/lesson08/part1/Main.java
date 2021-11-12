package lesson08.part1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        Running [] runners = {dog, duck};
        test(duck);
    }

    public static void test(Running run) {
        System.out.println("Бегут :");
        run.run();

    }

}
