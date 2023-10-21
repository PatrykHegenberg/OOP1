// Player class 
import java.util.List;
import java.util.ArrayList;

class Player { 
    private int id;
    private String team;
    private String name;
    public Player(int id, String team, String name){
        this.id = id;
        this.team = team;
        this.name = name;
    }
  
} 
  
/* Team class contains a list of Player
Objects.*/
class Team { 
    private List<Player> players;
    private String name;
    public Team(){
        players = new ArrayList<Player>();
    }
    public Team(List players, String name){
        this.players = players;
        this.name = name;
    }
    public Team(String name){
        players = new ArrayList<Player>();
        this.name = name;
    }
    public void addPlayer(int id, String team, String name){
        players.add(new Player(id, team, name));
    }
    public List<Player> getPlayers(){
        return this.players;
    }
    public int getSize(){
        return players.size();
    }
} 
  
/* School class contains a list of Team 
Objects.*/
class School { 
    private List<Team> teams;
    private String schoolName;
    public School(){
        teams = new ArrayList<Team>();
    }
    public int getTotalPlayersInSchool(){
        int total = 0;
        for(Team t: teams){
            total += t.getSize();
        }
        return total;
    }
    public void addTeam(Team t){
        teams.add(t);
    }
    public void AddTeam()
  
}  
  
// Main class
public class Main { 
  
    public static void main (String[] args) { 
        School s = new School();

    } 
  
} 
