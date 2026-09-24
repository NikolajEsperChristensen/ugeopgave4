package opgave4;

public class Main {
    public static void main(String[]args) {
        Team team1 = new Team("lyngby");
        Team team2 = new Team("nordshelland");


        Player player1 = new Player("nikolaj" ,  100);
        Player player2 = new Player("carl" ,  150);

        team1.addPlayer(player1);
        team2.addPlayer(player2);


        team1.printTeam();
    }


}
