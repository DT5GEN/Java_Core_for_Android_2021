package HomeWork04;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Scanner;


public class TicTacToeRetro {

    public static final int FIELD_SIZE = 3;
    public static final char[][] FIELD = new char[FIELD_SIZE][FIELD_SIZE];
    public static int turnsCount;

    public static final char HUMAN_DOT = 'X';
    public static final char AI_DOT = 'O';
    public static final char EMPTY_DOT = '•';
    public static final String GAG_SYMBOL = "♥";
    public static final String FIELD_SPACE = "  ";

    private static final int STATE_DROW = 0;
    private static final int STATE_WIN_HUMAN = 1;
    private static final int STATE_WIN_AI = 2;

    private static final Scanner in = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    private static boolean isGameOver;
    private int stateGameOver;


    public static void gameLauncher() {
        renderField();
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
        isGameOver = false;

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

    private void setGameOver(int gameOverState) {
        stateGameOver = gameOverState;
        isGameOver = true;
        renderField();
    }


    private void showMessageGameOver () {

        switch (stateGameOver) {
            case STATE_DROW -> System.out.println("НИЧЬЯ");
            case STATE_WIN_HUMAN -> System.out.println("Ты выиграл!");
            case STATE_WIN_AI -> System.out.println("КОМП ПОБЕДИЛ!");
            default -> throw new RuntimeException("Произошла какая-то ерунда " + stateGameOver);
        }


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

/*

    private  void playGame() {



        if (checkWin(HUMAN_DOT)) {
            setGameOver(STATE_WIN_HUMAN);
            return;
        }

        if (isFullMap()){
            setGameOver(STATE_DROW);
            return;
        }



        if (isFullMap()){
            setGameOver(STATE_DROW);
            return;
        }

        renderField();


        aiTurn();
        renderField();

        if (checkWin(AI_DOT)) {
            setGameOver(STATE_WIN_AI);
            return;
        }

        if (isFullMap()) {
            setGameOver(STATE_DROW);
            return;
        }


    }
*/


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
    }



    public  boolean isValidCell(int x, int y) {
        return x >= 0 && x < FIELD_SIZE && y >= 0 && y < FIELD_SIZE;
    }

    public  boolean isEmptyCell(int x, int y) {
        return FIELD[y][x] == EMPTY_DOT;
    }


    public  void aiTurn() {
        if (turnAIWinCell()){
            return;
        }
        if (turnHumanWinCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = RANDOM.nextInt(FIELD_SIZE);
            y = RANDOM.nextInt(FIELD_SIZE);
        } while (!isEmptyCell(x, y));
        FIELD [y][x] = AI_DOT;
    }



    private  boolean turnAIWinCell() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if(isEmptyCell(j,i)) {
                    FIELD[i][j] = AI_DOT;
                    if (checkWin(AI_DOT)) {
                        return true;
                    }
                    FIELD[i][j] = EMPTY_DOT;
                }

            }

        }
        return false;
    }

    private  boolean turnHumanWinCell() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (isEmptyCell(j, i)) {
                    FIELD[i][j] = HUMAN_DOT;
                    if (checkWin(HUMAN_DOT)) {
                        FIELD[i][j] = AI_DOT;
                        return true;
                    }
                    FIELD[i][j] = EMPTY_DOT;
                }

            }

        }
        return false;
    }

    //проверка на победу



    private boolean checkWin(int с) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (checkLine(i, j, 1, 0, FIELD_SIZE, с)) {
                    return true; // проверка по оси Х
                }
                if (checkLine(i, j, 1, 1, FIELD_SIZE, с)) {
                    return true; // проверка по диагонали Х У
                }
                if (checkLine(i, j, 0, 1, FIELD_SIZE, с)) {
                    return true; // проверка по оси У
                }
                if (checkLine(i, j, 1, -1, FIELD_SIZE, с)) {
                    return true; // проверка по оси Х -У
                }
            }

        }
        return false;
    }



    // проверка линии

    private  boolean checkLine(int x, int y, int vx, int vy, int len, int c) {
        final int farX = x + (len -1) * vx;     // посчитаем конец проверяемой линии
        final int farY = y + (len -1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;                       // проверяем, не выходит ли вектор за пределы игрового поля?
        }
        for (int i = 0; i < len; i++) {         // проход по проверяемой линии
            if (FIELD[y + i * vy][x + i * vx] != c) {
                return false;                   // проверяем одинаковые ли символы в ячейках?
            }
        }
        return true;
    }

    public  boolean isFullMap() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (FIELD[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private  void playGame() {


            turnHuman();
            renderField();
        update();
            }





    private void update() {

        if (checkWin(HUMAN_DOT)) {
            setGameOver(STATE_WIN_HUMAN);
            return;
        }

        if (isFullMap()){
            setGameOver(STATE_DROW);
            return;
        }

        if (isFullMap()){
            setGameOver(STATE_DROW);
            return;
        }

        renderField();

            aiTurn();
            renderField();

            if (checkWin(AI_DOT)) {
                setGameOver(STATE_WIN_AI);
                return;
            }

            if (isFullMap()) {
                setGameOver(STATE_DROW);
                return;
            }



    }


}
