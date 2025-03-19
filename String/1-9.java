import java.util.Scanner;
  
public class Main {
  public int solution(String str){
  	int answer = 0;
    String cleaned = str.toUpperCase().replaceAll("[A-Z]","");
    answer = Integer.parseInt(cleaned);
    
    return answer;
  }
  
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    
    System.out.print(T.solution(str));
  }
}