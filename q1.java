// class 
class Player {
    // attributes or properties 
    String name;
    int runs;
    int wickets;
    // constructor
    public Player(String name, int runs, int wickets) {
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
    }
    // getter methods
    public String getName() {
        return name;
    }
    public int getRuns() {
        return runs;
    }
    public int getWickets() {
        return wickets;
    }
}
// another class 
class CricketMatch {
    // attri
    Player[] team1;
    Player[] team2;
    // construct
    public CricketMatch(Player[] team1, Player[] team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    // total score method 
    public static int totalScore(Player[] team) {
        int total = 0;
        for (Player player : team) {
            total += player.getRuns();
        }
        return total;
    }
    // declare winner method
    public void declareWinner() {
        int team1Score = totalScore(team1);
        int team2Score = totalScore(team2);
        if (team1Score > team2Score) {
            System.out.println("Team 1 won");
        } else if (team2Score > team1Score) {
            System.out.println("Team 2 won");
        } else {
            System.out.println("It's a draw");
        }
    }
    // print details method 
    public void printDetails() {
        System.out.println("Team 1 Details:");
        printTeamDetails(team1);
        System.out.println("Team 2 Details:");
        printTeamDetails(team2);
    }
    // printin each team details method 
    public void printTeamDetails(Player[] team) {
        for (Player player : team) {
            System.out.println(player.getName() + " scored " + player.getRuns() + " runs and took " + player.getWickets() + " wickets.");
        }
        System.out.println("Total score: " + totalScore(team));
    }
}
// main class 
public class q1 {
    // main func or method 
    public static void main(String[] args) {
        System.out.println("\t\tCricket Match Simulator");
        // creating team 1
        Player[] team1 = new Player[11];
        for (int i = 0; i < 11; i++) {
            team1[i] = new Player("Player" + (i + 1), (int)(Math.random() * 100), (int)(Math.random() * 3));
        }
        // creating team 2 
        Player[] team2 = new Player[11];
        for (int i = 0; i < 11; i++) {
            team2[i] = new Player("Player" + (i + 12), (int)(Math.random() * 100), (int)(Math.random() * 2));
        }
        // match
        CricketMatch match = new CricketMatch(team1, team2);
        match.printDetails();
        match.declareWinner();
    }
}
