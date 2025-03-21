import java.util.Scanner;
  
public class Main {
  public int[] solution(String str, char c) {
    int len = str.length();
  	int[] ans = new int[len];
    int cnt = 100;
    for(int i = 0; i < len; i++) {
    	if (str.charAt(i) == c) {
        	cnt = 0;
        }
      	ans[i] = cnt;
      	cnt++;
    }
    
    cnt = 100;
    for(int i = len-1; i >= 0; i--) {
    	if (str.charAt(i) == c) {
        	cnt = 0;
        }
      	if (ans[i] > cnt) {
        	ans[i] = cnt;
        }
      
      	cnt++;
    }
    
    return ans;
    
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    
    int[] ans = T.solution(str,c);
    for(int x : ans) {
    	System.out.print(x + " ");
    }
    
  }
}