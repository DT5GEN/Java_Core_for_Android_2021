package lesson05;

public class Player extends Main {

    private static int countPlayers;

    private String nickname;
    private int points;
    private int lvl;
    private int money;


    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(String nickname, int points, int lvl, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.lvl = lvl;
        this.money = money;
        //   System.out.println(nickname + " - вызвал конструктор с 4-мя аргументами");

        countPlayers++;
    }


    public Player(String nickname) {
        this(nickname, 0, 1, 100);

        // System.out.println(nickname + " - вызвал конструктор с одним аргументом");
    }

    protected void printPlayerInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(" У игрока %s ( %d lvl) %d очков и накоплено %d монет ", nickname, lvl, points, money);
    }

    public String getNickname() {
        return nickname;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    protected int getMoney() {
        return money;
    }

    protected void setMoney(int money) {
        if (money > 999999999 || money < 0) {
            System.out.println("Количество монет " + money + " недопустимо!");
            return;
        }
        this.money = money;
    }
}
