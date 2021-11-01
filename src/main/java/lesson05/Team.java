package lesson05;

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

    public void teamInfo() {
        String lineup = "";
        int allPoints = 0;


        for (int i = 0; i < playersCount; i++) {
            Player player = players[i];
            allPoints += player.getPoints();
            lineup += String.format("\n %s ( %d lvl )", player.getNicknane(), player.getLevel());
            if (i != playersCount - 1) {
                lineup += ",";
            } else {
                lineup+=".";
            }
        }
        System.out.printf("Команда %s  имеет общее количество   очков %d .\n Состав команды:  %s ", teamName, allPoints, lineup);

    }
}
