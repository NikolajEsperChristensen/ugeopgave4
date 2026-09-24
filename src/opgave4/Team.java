package opgave4;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }
    public double getAverageSkill() {
        double sum = 0;
        for (Player player : players){
            sum += player.getAverageSkill();

        }
        return sum / players.size();
    }
    public void printTeam() {
        for (Player player : players)
            System.out.println(player);
    }
}

