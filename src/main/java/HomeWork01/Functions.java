package HomeWork01;

public class Functions extends HomeWorkApp {


    protected static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }

    protected static void checkSumSign() {
        int a = 2;
        int b = 5;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


    protected static void printColor() {

        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }

    }


    protected static void compareNumbers(){

        int a, b ;
        a = 15;
        b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }

}
