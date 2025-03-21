import java.util.Scanner;
  
public class Main {
  public String solution(String str) {
  	String cleaned = str.toUpperCase().replaceAll("[^A-Z]","");
    int left = 0;
    int right = cleaned.length() - 1;
    
    while(left <= right) {
    	if(cleaned.charAt(left) != cleaned.charAt(right)) return "NO";
      	left++;
        right--;
    }
    
    return "YES";
    
  }
  
  public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        
        System.out.print(T.solution(str));
  }
}