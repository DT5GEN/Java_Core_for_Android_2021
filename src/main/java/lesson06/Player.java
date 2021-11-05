package lesson06;

public class Player {
    private static int countPlayers;

    private String nickname;
    private int points;
    private int level;
    private int money;

    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname;
        this.points = points;
        this.level = level;
        setMoney(money);

        countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(String nickname) {
        this(nickname, 0, 1, 0);
    }

    void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("У игрока %s(уровень: %d) %d очков и накоплено %d монет", nickname, level, points, money);
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 999999 || money < 0) {
            System.out.println("Кол-во монет " + money + " недопустимо!");
            return;
        }
        this.money = money;
    }
}
