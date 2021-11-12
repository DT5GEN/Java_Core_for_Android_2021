package lesson05;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Player player1 = new Player("Timofei", 1500, 57, 6000);
        Player player2 = new Player("Dorofei",5000,60,0);
        Player player3 = new Player("Kotofei", 1800, 35, 2000);
        Player player4 = new Player("Gomofei");
        Player player5 = new Player("Путаfei");

//        player1.nickname = "Timofei";
//        player2.nickname = "Dorofei";
//        player3.nickname = "Kotofei";
//        player4.nickname = "Gomofei";

//        System.out.println(player1.nickname);
//        System.out.println(player2.nickname);
//        System.out.println(player3.nickname);
//        System.out.println(player4.nickname);

//        player2.money = -4000;
//        player2.money = -4000;

//        player2.setMoney(1200);
        player2.setLvl(80);
        player2.setMoney(30000);

        System.out.println();

        player1.printPlayerInfo();
        player2.printPlayerInfo();
        player3.printPlayerInfo();
        player4.printPlayerInfo();
        player5.printPlayerInfo();

//         System.out.println(player1);

        System.out.println("  Всего создано " + Player.getCountPlayers() + " игрока.");
        System.out.println();
        Player [] players = {player1, player2, player3};
        for (Player player : players) {
            player.printPlayerInfo();
        }
    }
}
