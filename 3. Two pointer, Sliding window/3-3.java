import java.util.*;

public class Main{
	public void solution(){
    	Scanner kb = new Scanner(System.in);
      	int n = kb.nextInt();
      	int k = kb.nextInt();
      	int[] arr = new int[n];
      
      	for(int i = 0; i < n; i++) {
        	arr[i] = kb.nextInt();
        }
      	
      	int sum = 0;
      	
      	for(int i = 0; i < k; i++) {
        	sum += arr[i];
        }
      	
      	int max = sum;
      	for(int i = k; i < n; i++){
        	sum = sum - arr[i-k] + arr[i];
          	if(sum > max) max = sum;
        }
      
      	System.out.print(max);
    }
	
	public static void main(String[] args){
		Main T = new Main();
		T.solution();
	}

}