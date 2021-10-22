package HomeWork02;

public class HomeWorkApp {

    public static void main(String[] args) {

        checkHomeWork();
    }

    public static void checkHomeWork() {
        System.out.println("\n  Задание 1 \n");
        System.out.println("Задание  возвращает " + Functions.checkingNumber(12, 6));
        System.out.println("\n  Задание 2 \n");
        System.out.println(Functions.checkPositive(4));
        System.out.println("\n  Задание 3 \n");
        System.out.println("Задание  возвращает " + Functions.checkNegative(-3));
        System.out.println("\n  Задание 4 \n");
        Functions.printString("Такой пример вот", 5);
        System.out.println("\n  Задание 5 \n");
        System.out.println(" - " + Functions.checkYears(2024));

    }
}
