import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

  class Checker implements Comparator<Player> {
	   
    public int compare(Player a, Player b) {
      if(a.score == b.score) {
        return a.name.compareTo(b.name);
      }
      return b.score - a.score;
    }
  }

  class Player{
    String name;
    int score;

    Player(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }

  public class SortingComparator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of players: ");
      int n = input.nextInt();

      Player[] player = new Player[n];
      Checker checker = new Checker();
  
      System.out.println();
      System.out.print("Enter the player's name and score: ");

      for(int i = 0; i < n; i++) {
        player[i] = new Player(input.next(), input.nextInt());
      } 
      input.close();

      Arrays.sort(player, checker);
      System.out.println();
      for(int i = 0; i < player.length; i++){
        System.out.printf("%s %s\n", player[i].name, player[i].score);
      }
    }
  }
