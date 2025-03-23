import java.util.*;

public class Main{
	public int solution(int[] arr, int n){
    	int answer = 0;
      	int res[] = new int[n];
      	if(arr[0] == 0) res[0] = 0;
      	else res[0] = 1;
      
      	for(int i = 1; i < n; i++){
        	if(arr[i] == 0) res[i] = 0;
          	else {
            	res[i] = res[i-1] + 1;
            }
        }
      
      	for(int i = 0; i < n; i++) {
        	answer += res[i];
        }
      
      	return answer;
    }
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
      	int n = kb.nextInt();
      	int[] arr = new int[n];
      	
      	for(int i = 0; i < n; i++) {
        	arr[i] = kb.nextInt();
        }

		System.out.print(T.solution(arr,n));
	}

}