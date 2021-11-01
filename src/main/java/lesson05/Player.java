package lesson05;

import HomeWork02.HomeWorkApp;

public class Player {
    private static int countsPlayer;

    private String nicknane;

    private int level;
    private int points;
    private int money;




    public Player(String nicknane, int level, int points, int money) {
        this.nicknane = nicknane.toUpperCase();
        this.level = level;
        this.points = points;
        this.money = money;
        countsPlayer++;
       // System.out.println(nicknane + "вызвал этот конструктор с четырьмя аргументами");
    }

    public static int getCountsPlayer() {
        return countsPlayer;
    }

    public Player(String nicknane
    ) {
this(nicknane, 1 ,0 ,0);
  //      System.out.println(nicknane + "вызвал этот конструктор с одним аргументом");
    }
    void printInfo() {
        System.out.printf("У игрока %s (%d lvl) %d очков и накоплено %d монет \n",nicknane,level,points,money);

     //   System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("У игрока %s (%d lvl) %d очков и накоплено %d монет ",nicknane,level,points,money);
    }

    public String getNicknane() {
        return nicknane;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money <0){
            System.out.println("Нужно больше монет");
            return;
        }
        this.money = money;
    }
}
