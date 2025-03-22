import java.util.*;

public class Main{
	public int solution(int n){
    	boolean[] isPrime = new boolean[n+1];
      	Arrays.fill(isPrime, true);
      	isPrime[0] = isPrime[1] = false;
      	
      	//에라토스테네스의 체
      	for(int i = 2; i * i <= n; i++) {
        	for(int j = i * i; j <= n; j += i) {
            	isPrime[j] = false;
            }
        } 
      	
      	int cnt = 0;
      	for(int i = 0; i <= n; i++) {
        	if(isPrime[i]) cnt++;
        }
      	
      	return cnt;
    }
	
	public static void main(String[] args){
		Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
	}

}