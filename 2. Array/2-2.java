import java.util.*;

public class Main{
	public int solution(int[] arr, int n){
    	int answer = 0;
      	int max = -1;
      
      	for(int i = 0; i < n; i++) {
        	if(arr[i] > max) {
                max = arr[i];  
                answer++;
            }
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

		System.out.print(T.solution(arr, n));
	}

}