package HomeWork03;

import java.util.*;
import java.util.stream.IntStream;

public class Functions extends HomeWorkApp {


    static void choosingHomework() {

        System.out.println("\nУкажите в консоли целым числом НОМЕР Домашнего Задания от 1 до 8,\nкоторое желаете проверить и нажмите ENTER\n" +
                "или введите любое другое число для выхода из программы проверки");

        int numbTask = scan.nextInt();
        if (numbTask == 1) {
            createArray01();
        } else if (numbTask == 2) {
            createArray02();
        } else if (numbTask == 3) {
            createArray03();
        } else if (numbTask == 4) {
            createArray04();
        } else if (numbTask == 5) {
            createArray05(4, 6);
        } else if (numbTask == 6) {
            comparisonArray06();
        } else if (numbTask == 7) {
            comparisonArray07();
        } else if (numbTask == 8) {
            offsetMethod();
        } else {
            return;
        }
    }


/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;

*/

    static void createArray01() {

        System.out.println("\t Задание 1\nВыводим случайные значения массива:");
        int[] twoValues = new int[10];
        for (int i = 0; i < twoValues.length; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            if (x < 50) {
                twoValues[i] = 1;
                System.out.print(twoValues[i]);
            } else twoValues[i] = 0;
            System.out.print(twoValues[i]);
        }
        System.out.println("\n\t Инверсия");
        for (int j = 0; j < twoValues.length; j++) {
            if (twoValues[j] == 1) {
                twoValues[j] = 0;
                System.out.print(twoValues[j]);
            } else twoValues[j] = 1;
            System.out.print(twoValues[j]);
        }
        System.out.println();
        choosingHomework();
    }

/*2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/


    static void createArray02() {
        System.out.println("\n\n" +
                "\t Задание 2\nЗаполняем массив от 1 до 100:");
        int[] hundredValues = new int[100];
        for (int i = 0; i < hundredValues.length; i++) {
            hundredValues[i] = i + 1;
            System.out.print(" " + hundredValues[i]);
        }
        System.out.println();
        choosingHomework();
    }

/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */


    static void createArray03() {
        System.out.println("\n\n" +
                "\t Задание 3\nЗаполняем массив от 1 до 12 рандомными значениями:");
        int[] someValues = new int[12];

        for (int i = 0; i < someValues.length; i++) {
            Random random = new Random();
            int x = random.nextInt(11) + 1;
            someValues[i] = x;
            System.out.print(" " + someValues[i]);
        }

        System.out.println("\n\t и умножаем на 2 значения меньше 6");
        for (int j = 0; j < someValues.length; j++) {
            if (someValues[j] < 6) {
                someValues[j] = someValues[j] * 2;
                System.out.print(" " + someValues[j]);
            } else
                System.out.print(" " + someValues[j]);
        }
        System.out.println();
        choosingHomework();

    }

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/


    static void createArray04() {
        System.out.println("\n\n" +
                "\t Задание 4\nЗаполняем двумерный массив:");
        String msg = "Укажите целым числом размер массива в консоли и нажмите ENTER";
        System.out.println(msg);
        int z = scan.nextInt();
        int[][] squadValues = new int[z][z];
        for (int i = 0; i < squadValues.length; i++) {
            for (int j = 0; j < squadValues.length; j++) {
                if (i == j || (i + j == z - 1)) {
                    squadValues[i][j] = 1;
                    System.out.print("  " + squadValues[i][j]);
                } else
                    System.out.print("  " + squadValues[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
        choosingHomework();
    }


  /*  5. Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив
        типа int длиной len, каждая ячейка которого равна initialValue;*/

    static void createArray05(int len, int initialValue) {
        System.out.println("\n\n" +
                "\t Задание 5\n");
        String msg = "Укажите целым числом размер массива в консоли и нажмите ENTER";
        System.out.println(msg);
        int z = scan.nextInt();
        int[] squadValues = new int[z];
        String msg2 = "Укажите в консоли целым числом значение, которым будет заполнен  массив и нажмите ENTER";
        System.out.println(msg2);
        int y = scan.nextInt();
        for (int i = 0; i < squadValues.length; i++) {
            squadValues[i] = y;
            System.out.print("  " + squadValues[i]);
        }
        System.out.println();
        choosingHomework();
    }

    /*  6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/

    static void comparisonArray06() {
        System.out.println("\t Задание 6\nВыводим случайные значения массива:");
        int[] twoValues = new int[10];

        for (int i = 0; i < twoValues.length; i++) {
            Random random = new Random();
            int x = random.nextInt(10);
            twoValues[i] = x;
            System.out.print(twoValues[i] + " ");
        }
        IntStream intStream = Arrays.stream(twoValues);
        OptionalInt optionalInt = intStream.max();
        int max = optionalInt.getAsInt();
        IntStream intStream2 = Arrays.stream(twoValues);
        OptionalInt optionalInt1 = intStream2.min();
        int min = optionalInt1.getAsInt();
        System.out.printf("\nМаксимальное значение в массиве %d ,\tа минимальное  %d \n", max, min);

        System.out.println();
        choosingHomework();
    }


/*    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место,
    в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/


    static void comparisonArray07() {
        System.out.println("\t Задание 7\nВыводим случайные значения массива :");
        int[] twoValues = new int[10];

        for (int i = 0; i < twoValues.length; i++) {
            Random random = new Random();
            int x = random.nextInt(10);
            twoValues[i] = x;
            System.out.print(twoValues[i] + " ");
        }
        System.out.println("\nСравним суммы левой и правой части массива:");
        String total = (checkArray(twoValues)) ? "в массиве есть место,\n" +
                "в котором сумма левой и правой части массива равны  " : "в массиве нет местa," +
                " в котором сумма левой и правой части массива равны  ";
        System.out.print(total);
        System.out.println();
        choosingHomework();

    }

    static boolean checkArray(int[] array) {

        int left, right;
        for (int i = 1; i < array.length; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left = left + array[j];
            }
            for (int j = i; j < array.length; j++) {
                right = right + array[j];
            }
            System.out.println(left + " ||| " + right);
            if (left == right) {
                return true;
            }
        }
        return false;
    }


 /*   8. *** Написать метод, которому на вход подается одномерный массив и число n
            (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.*/


    static void offsetMethod() {

        System.out.println("\t Задание 8\nВыводим случайные значения массива :");
        int largeArrays = 10;
        String[] twoValues = new String[largeArrays];


        for (int i = 0; i < twoValues.length; i++) {
            Random random = new Random();
            int x = random.nextInt(10);
            String temp = String.valueOf(x);
            twoValues[i] = temp;
            System.out.print(twoValues[i] + " ");
        }
        System.out.println("\nУкажите в консоли целым числом значение, на которое будет сдвинут  массив и нажмите ENTER");
        int offset = scan.nextInt();
        System.out.println("\nМассив без сдвига : " + Arrays.toString(twoValues));
        List<String> list = Arrays.asList(twoValues);
        Collections.rotate(list, offset);
        System.out.println("Массив со сдвигом : " + list);

        System.out.println();
        choosingHomework();
    }
}