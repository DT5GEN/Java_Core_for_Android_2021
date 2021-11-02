package HomeWork04;

import java.util.Random;
import java.util.Scanner;


public class TicTacToeRetro {

    public static final int FIELD_SIZE = 52;
    public static final int WIN_LINE = 3;
    public static final char[][] FIELD = new char[FIELD_SIZE][FIELD_SIZE];
    public static int turnsCount;

    public static final char HUMAN_DOT = 'X';
    public static final char AI_DOT = 'O';
    public static final char EMPTY_DOT = '•';
    public static final String GAG_SYMBOL = "♥";
    public static final String FIELD_SPACE = "  ";


    private static final Scanner in = new Scanner(System.in);
    public static final Random random = new Random();

    public static int lastX;
    public static int lastY;

    private static boolean isGameOver;
    private int stateGameOver;


    public static void gameLauncher() {
        do {
            System.out.println("\n\nИгра начинается!");
            init();
            renderField();
            playGame();

        } while (isContinueGame());
        endGame();

    }

    private static void init() {
        initField();
        turnsCount = 0;
    }


    public static void initField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                FIELD[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void renderField() {
        printHeader();
        printBodyMap();
        turnsCount = 0;

    }

    private static void printHeader() {
        System.out.print(GAG_SYMBOL + FIELD_SPACE);
        for (int i = 0; i < FIELD_SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + FIELD_SPACE);
    }

    private static void printBodyMap() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(FIELD[i][j] + FIELD_SPACE);
            }
            System.out.println();
        }
    }


    private static void playGame() {
        while (true) {
            turnHuman();
            renderField();
            if (checkEnd(HUMAN_DOT)) {
                break;
            }

            turnAI();
            renderField();
            if (checkEnd(AI_DOT)) {
                break;
            }
        }

    }


    private static void turnHuman() {
        System.out.println("ХОД ЧЕЛОВЕКА");
        int rowNumber, columnNumber;

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
        }

        FIELD[rowNumber][columnNumber] = HUMAN_DOT;
        turnsCount++;
        lastX = rowNumber;
        lastY = columnNumber;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату(1-" + FIELD_SIZE + "): ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                } else {
                    System.out.println("\nПроверьте значение координаты. Должно быть от 1 до " + FIELD_SIZE);
                }
            } else {
                in.next();
                System.out.println("\nВвод допускает лишь целые числа!");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= FIELD_SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return FIELD[rowNumber][columnNumber] == EMPTY_DOT;
    }


    private static boolean checkEnd(char symbol) {
        if (checkWinModDown(symbol)) {
            if (symbol == HUMAN_DOT) {
                System.out.println("\nУра!! Вы победили!");
            } else {
                System.out.println("\nВосстание близко... ИИ победил");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("\nНичья!");
            return true;
        }

        return false;
    }

 /*   private static boolean checkWin(char symbol) {
        if (FIELD[0][0] == symbol && FIELD[0][1] == symbol && FIELD[0][2] == symbol) {
            return true;
        }
        if (FIELD[1][0] == symbol && FIELD[1][1] == symbol && FIELD[1][2] == symbol) {
            return true;
        }
        if (FIELD[2][0] == symbol && FIELD[2][1] == symbol && FIELD[2][2] == symbol) {
            return true;
        }

        if (FIELD[0][0] == symbol && FIELD[1][0] == symbol && FIELD[2][0] == symbol) {
            return true;
        }
        if (FIELD[0][1] == symbol && FIELD[1][1] == symbol && FIELD[2][1] == symbol) {
            return true;
        }
        if (FIELD[0][2] == symbol && FIELD[1][2] == symbol && FIELD[2][2] == symbol) {
            return true;
        }

        if (FIELD[0][0] == symbol && FIELD[1][1] == symbol && FIELD[2][2] == symbol) {
            return true;
        }
        if (FIELD[0][2] == symbol && FIELD[1][1] == symbol && FIELD[2][0] == symbol) {
            return true;
        }

        return false;
    }*/

    // Проверка столбца
    private static boolean checkWinModY(char symbol) {
        int tempWinLine = 0;

        for (int i = 0; i < WIN_LINE; i++) {

            if (symbol == FIELD[i][lastX]) {
                tempWinLine++;
                if (tempWinLine == WIN_LINE)
                    return true;
            } else {
                tempWinLine = 0;
            }
        }
        return false;
    }
// Голова не ссображает, как собрать в кучу проверку всех диагоналей
    private static boolean checkWinModX(char symbol) {
        int tempWinLine = 0;

        for (int i = 0; i < WIN_LINE; i++) {

            if (lastX - lastY >= 0) {

                if (symbol == FIELD[i + lastX - lastY][i]) {
                    tempWinLine++;
                    if (tempWinLine == WIN_LINE)
                        return true;
                } else {
                    tempWinLine = 0;
                }
                if (lastX - lastY < 0) {
                    if (symbol == FIELD[i][i + lastX - lastY]) {
                        tempWinLine++;
                        if (tempWinLine == WIN_LINE)
                            return true;
                    } else {
                        tempWinLine = 0;
                    }
                }
            }
        }


        return false;
    }


    private static boolean checkWinModDown(char symbol) {
        int tempWinLine = 0;

        for (int i = 0; i < WIN_LINE; i++) {

            if (lastX - lastY >= 0) {

                if (symbol == FIELD[i + lastX - lastY][i]) {
                    tempWinLine++;
                    if (tempWinLine == WIN_LINE)
                        return true;
                } else {
                    tempWinLine = 0;
                }
                if (lastX - lastY < 0) {
                    if (symbol == FIELD[i][i + lastX - lastY]) {
                        tempWinLine++;
                        if (tempWinLine == WIN_LINE)
                            return true;
                    } else {
                        tempWinLine = 0;
                    }
                }
            }
        }


        return false;
    }
    // Проверка строки
    private static void checkWinModХ(char symbol) {
        int tempWinLine = 0;

        for (int i = 0; i < WIN_LINE; i++) {

            if (symbol == FIELD[i][lastX]) {
                tempWinLine++;
            } else {
                tempWinLine = 0;
            }
        }

    }

    private static boolean checkDraw() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (FIELD[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;

    }


    static void turnAI() {
        System.out.println("ХОД ИИ");
        int rowNumber, columnNumber;

        do {
            rowNumber = random.nextInt(FIELD_SIZE);
            columnNumber = random.nextInt(FIELD_SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        FIELD[rowNumber][columnNumber] = AI_DOT;
        turnsCount++;
        lastX = rowNumber;
        lastY = columnNumber;

    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "yes", "+", "да", "конечно" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Спасибо за игру!");
    }

}
