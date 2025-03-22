import java.util.*;

public class Main{
  
	public void solution(int n){
      	int[] fibo = new int[n];
      	fibo[0] = 1;
      	fibo[1] = 1;
      
    	for(int i = 2; i < n; i++) {
        	fibo[i] = fibo[i-1] + fibo[i-2];
        }
      
      	for(int i = 0; i < n; i++) {
        	System.out.print(fibo[i] + " ");
        }
    }
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
      	int n = kb.nextInt();

		T.solution(n);
	}

}