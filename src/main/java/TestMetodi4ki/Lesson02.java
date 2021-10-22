package TestMetodi4ki;

import java.util.Random;
import java.util.Scanner;

public class Lesson02 {
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int  a, attempts;
         attempts = 0;

        int x = rand.nextInt(9);
        a = sc.nextInt();
        while (a != x) {
            if (a > x) {
                System.out.println(" Компьютер Вам сообщает, Ваше число больше , чем загаданное");
                attempts += 1;
            }
            else {
                System.out.println(" Компьютер Вам сообщает, Ваше число меньше , чем загаданное");
                attempts += 1;
            }
        }
        System.out.println("Компьютер загадал число " + a);



        sc.close();
        System.out.println("Введите 1 - чтобы перезапустить ИГРУ!\nВведите 0 - чтобы закончить ИГРУ!");
        System.out.println("Спасибо за игру!");

    }
}