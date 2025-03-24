import java.util.*;

public class Main{
	public int solution(int[][] arr, int n){
    	int max = -1;
      	// 행, 열
      	for(int i = 0; i < n; i++) {
          	int sum = 0;
        	for(int j = 0; j < n; j++) {
            	sum += arr[i][j];
            }
          	if(sum > max) max = sum;
        }
      	
      	for(int i = 0; i < n; i++) {
          	int sum = 0;
        	for(int j = 0; j < n; j++) {
            	sum += arr[j][i];
            }
          	if(sum > max) max = sum;
        }
      	
      	// 내려가는 대각선
      	for(int i = 0; i < n; i++) {
          	int sum = 0;
        	for(int j = 0; j < n; j++) {
            	if(j == i) sum += arr[i][j];
            }
          	if(sum > max) max = sum;
        }
      	
      	// 올라가는 대각선
      	for(int i = 0; i < n; i++) {
          	int sum = 0;
        	for(int j = 0; j < n; j++) {
            	if(j == (n - i)) sum += arr[i][j];
            }
          	if(sum > max) max = sum;
        }
      	
      	return max;
    }
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
      	int n = kb.nextInt();
      	int[][] arr = new int[n][n];
      	for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
            	arr[i][j] = kb.nextInt();
            }
        }

		System.out.print(T.solution(arr, n));
	}

}