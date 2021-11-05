package lesson06;

public class Team {
    private final int DEFAULT_MAX_PLAYERS = 10;
    final Player[] players = new Player[DEFAULT_MAX_PLAYERS];
    private int playersCount;
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }


    public boolean addPlayer(Player player) {
        if (playersCount == DEFAULT_MAX_PLAYERS) {
            return false;
        }

        players[playersCount++] = player;

        return true;
    }

    public boolean addPlayer(Player... players) {
        boolean result = true;

        for (Player player : players) {
            result &= addPlayer(player);
        }

        return result;
    }

    public void printInfo() {
        int allPoints = 0;
        String lineup = "";

        for (int i = 0; i < playersCount; i++) {
            Player player = players[i];
            allPoints += player.getPoints();

            lineup += String.format("%s(lvl: %d, money: %d)", player.getNickname(), player.getLevel(), player.getMoney());
            if (i != playersCount - 1) {
                lineup += ", ";
            } else {
                lineup += ".";
            }
        }

        System.out.printf("Команда %s имеет в общем %d очков. Состав команды: %s%n",
                teamName, allPoints, lineup );
    }
}
