package lesson05;


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Лимофей", 2, 50, 100);
        Player player2 = new Player("Ксимофей");
        Player player3 = new Player("DoRoфей", 1, 222, 50);

//        player1.nicknane = "Лимофей";
//        player2.nicknane = "Ксимофей";
//        player3.nicknane = "DoRoфей";

//        System.out.println(player1.nicknane.toUpperCase(Locale.ROOT) + " " + player2.nicknane.toUpperCase() + player3.toString() );

        //  System.out.println("Всего " + Player.getCountsPlayer() + " игрока");
        player1.setMoney(3545);
        player3.setLevel(80);

//        player1.printInfo();
//        player2.printInfo();
        //    player3.printInfo();

        Player[] players = {player1, player2, player3};
        for (Player playboys : players) {
            playboys.printInfo();
        }

//        Team team = new Team("Aventador");
//        team.addPlayer(player1);
//        team.addPlayer( player3);


        //team.teamInfo();
    }
}
