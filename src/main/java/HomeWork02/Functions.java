package HomeWork02;

public class Functions extends HomeWorkApp {


    protected static boolean checkingNumber(int a, int b) {


        int sum = a + b;

        if (sum < 10 || sum > 20) {
            return false;
        } else {
            return true;
        }

    }

    protected static int checkPositive(int a) {


        if (a >= 0) {
            System.out.print("Число положительное  ");
        } else {
            System.out.print("Число отрицательное  ");
        }

        return a;
    }


    protected static boolean checkNegative(int a) {


        if (a <= 0) {
            return true;
        } else {
            return false;
        }


    }

    protected static void printString(String text, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Строка распечаталась с текстом:" + '"' + text + '"' + " " + (i + 1) + " раз.");

        }

    }


    protected static boolean checkYears(int year) {
        if (year % 4 == 0 &&  year % 100 != 0 ) {
            System.out.print("Указанный в методе Год високосный ");
            return true;
        } else if (year % 400 == 0) {
            System.out.print("Указанный в методе Год високосный ");
            return true;
        } else {
            System.out.print("Указанный в методе Год не високосный ");
            return false;
        }
    }

}
