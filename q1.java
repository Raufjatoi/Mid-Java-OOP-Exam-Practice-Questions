class Player {
    // Instance attributes
    private String name;
    private int runs;
    private int wickets;

    // Constructor
    public Player(String name, int runs, int wickets) {
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
    }

    // Getter methods
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

class CricketMatch {
    private Player[] team1;
    private Player[] team2;

    public CricketMatch(Player[] team1, Player[] team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Calculate the total score for each team
    public static int totalScore(Player[] team) {
        int total = 0;
        for (Player player : team) {
            total += player.getRuns(); // Adding the player's score to the total
        }
        return total;
    }

    // Declare the winning team based on the highest score
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

    // Print a summary of the match with player details and team scores
    public void printDetails() {
        System.out.println("Team 1 Details:");
        printTeamDetails(team1);
        System.out.println("Team 2 Details:");
        printTeamDetails(team2);
    }

    private void printTeamDetails(Player[] team) {
        for (Player player : team) {
            System.out.println(player.getName() + " scored " + player.getRuns() + " runs and took " + player.getWickets() + " wickets.");
        }
        System.out.println("Total score: " + totalScore(team));
    }
}

public class q1 {
    public static void main(String[] args) {
        System.out.println("\t\tCricket Match Simulator");

        // Creating players for team 1
        Player[] team1 = new Player[11];
        for (int i = 0; i < 11; i++) {
            team1[i] = new Player("Player" + (i + 1), (int)(Math.random() * 100), (int)(Math.random() * 5));
        }

        // Creating players for team 2
        Player[] team2 = new Player[11];
        for (int i = 0; i < 11; i++) {
            team2[i] = new Player("Player" + (i + 12), (int)(Math.random() * 100), (int)(Math.random() * 5));
        }

        // Initializing the cricket match
        CricketMatch match = new CricketMatch(team1, team2);

        // Printing match details
        match.printDetails();

        // Declaring the winner
        match.declareWinner();
    }
}
