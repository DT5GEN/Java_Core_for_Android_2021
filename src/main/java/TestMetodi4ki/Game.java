package TestMetodi4ki;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Game {

    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);



    public static  void main(String[] args) throws Exception {


            gameSearch();


    }

    public static void gameMode() throws Exception {
        int a;

        try {
            String message = "\n Введите 1 - чтобы перезапустить ИГРУ!\n Введите 0 - чтобы закончить ИГРУ!\n ";
            System.out.println(message);
            a = scan.nextInt();

            if (a == 1) {
                gameSearch();
            } else if (a == 0) {
                scan.close();
                System.out.println("Спасибо за игру!");
            } else {
                //System.out.println("Введите 1 - чтобы перезапустить ИГРУ!\nВведите 0 - чтобы закончить ИГРУ!");
                gameMode();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


        throw new Exception("String can not be empty!");

    }

    public static void gameSearch() throws Exception {

        int x = rand.nextInt(10) + 1;
        System.out.println("\n \nВам дается 3 попытки угадать  число");
        for (int counter = 0; counter < 3; ) {
            System.out.println("Введите число: ");
            int a = scan.nextInt();

            if (a != x) {
                if (counter > 0) {

                    if (x > a) {
                        System.out.println(" Компьютер Вам сообщает, Ваше число меньше , чем загаданное");
                    } else {
                        System.out.println(" Компьютер Вам сообщает, Ваше число больше , чем загаданное");
                    }
                }
                counter++;

                System.out.println("\t попробуйте ёщё раз\n");
                if (a > x ) {
                }
                System.out.println("\t Попытка " + (counter + 1));
            } else if (a == x) {
                System.out.println("Поздравляем,Вы угадали число с " + counter + " попытки");
                break;
            }
            throw new Exception("String can not be empty!");
        }

        // System.out.println("Попытки закончились");
        gameMode();
    }
}

