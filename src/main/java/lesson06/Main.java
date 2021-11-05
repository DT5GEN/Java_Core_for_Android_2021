package lesson06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Timofei", 1500, 57, 9999);
        Player player2 = new Player("Ksenia");
        Player player3 = new Player("Vadim", 1750, 65, 11290);

//        System.out.println(Player.getCountPlayers());

        player2.setMoney(15000);
        player2.setLevel(80);
        player2.setPoints(2350);

/*        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.printInfo();
        }*/

        Team team = new Team("Avengers");
        team.addPlayer(player1, player2, player3);

        team.printInfo();
    }
}


