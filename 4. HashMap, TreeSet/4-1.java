import java.util.*;
  
public class Main {
  public void solution() {
  	Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String arr = kb.next();
    char answer = ' ';
    HashMap<Character, Integer> votes = new HashMap<>();
    
    int max = -1;
    for(char x : arr.toCharArray()) {
    	votes.put(x,votes.getOrDefault(x,0)+1);
    }
    
    for(char x : votes.keySet()){
    	if(votes.get(x) > max) {
        	max = votes.get(x);
          	answer = x;
        }
    }
    
    System.out.print(answer);
    
  }
  
  public static void main(String[] args){
    Main T = new Main();
    T.solution();
  }
}