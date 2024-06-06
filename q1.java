//1. Cricket Match Simulator:



//o Create a class named Player with attributes for name, runs scored, and wickets
//taken.
class Player{
    // attributes 
    static String name ;
    static int runs , wickets ;

    //contruct
    public Player ( String name , int runs , int wickects){
        this.name = name;
        this.runs = runs;
        this.wickets = wickects;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return runs;
    }
}

//o Design a class named CricketMatch that simulates a cricket match between two
//teams (represented by arrays of Player objects).
class CricketMatch{
    static Player team1 [] = new Player[11]; // 11 player in a team
    static Player team2 [] = new Player[11]; // 2nd team 

    public CricketMatch ( Player [] team1 , Player[] team2){
        this.team1 = team1;

    }
    //o Implement methods in CricketMatch to:
    public static void add_player (Player p1 , Player p2 , Player p3 , Player p4 ,  Player p5 , Player p6 , Player p7 ,
    Player p8 , Player p9 , Player p10 , Player p11){
        for (int i = 0; i < 11 ; i++){
            p1.add(team1);
        }
    }

    // Calculate the total score for each team.
    public static int total_score(Player[] team) {
        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += team[i].getScore(); //Adding the player's score to the total
        }
        return total;
    }
       // Declare the winning team based on the highest score.
      public static void winner (){
        if ( CricketMatch.total_score(team1) > CricketMatch.total_score(team2)){
            System.out.println("team1 won");}
        else if ( CricketMatch.total_score(team2) > CricketMatch.total_score(team1)){
            System.out.println("team2 won");}
        else {
            System.out.println("its a draw");
        }
     }
      // Print a summary of the match with player details and team scores
      public static void details(Player [] team){
        for (int i = 0; i < 11 ; i++){
            System.out.println(team[i].getName() + "score is " +  team[i].getScore());

        }
        System.out.println("total score was " + CricketMatch.total_score(team));
      }
            
  }
 
public class q1 {
    public static void main(String[] args) {
        System.out.println("\t\t Cricket Match Simulator ");

        Player p1 = new Player("rauf", 30, 2);
        Player p2 = new Player("rauf", 30, 2);
        Player p3 = new Player("rauf", 30, 2);
        Player p4 = new Player("rauf", 30, 2);
        Player p5 = new Player("rauf", 30, 2);
        Player p6 = new Player("rauf", 30, 2);
        Player p7 = new Player("rauf", 30, 2);
        Player p8 = new Player("rauf", 30, 2);
        Player p9 = new Player("rauf", 30, 2);
        Player p10 = new Player("rauf", 30, 2);
        Player p11 = new Player("rauf", 30, 2);
        Player p12 = new Player("rauf", 30, 2);
        Player p13 = new Player("rauf", 30, 2);
        Player p14 = new Player("rauf", 30, 2);
        Player p15 = new Player("rauf", 30, 2);
        Player p16 = new Player("rauf", 30, 2);
        Player p17 = new Player("rauf", 30, 2);
        Player p18 = new Player("rauf", 30, 2);
        Player p19 = new Player("rauf", 30, 2);
        Player p20 = new Player("rauf", 30, 2);
        Player p21 = new Player("rauf", 30, 2);
        Player p22 = new Player("rauf", 30, 2);

        CricketMatch team1 = new CricketMatch(null, null)
    }
    
}
