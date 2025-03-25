import java.util.Scanner;
  
public class Main {
  public void solution(int[][] arr, int n) {
  	int answer = 0;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    
    for(int i = 1; i < n+1; i++) {
      	int cnt = 0;
      
    	for(int j = 1; j < n+1; j++) {
        	for(int k = 0; k < 4; k++) {
        		if(arr[i][j] > arr[i+dx[k]][j+dy[k]]) cnt++;
              	
        	}
          	if(cnt == 4) answer++;
          	cnt = 0;
        }
    }
    
    System.out.print(answer);
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[][] arr = new int[n+2][n+2];
    
    for(int i = 1; i < n+1; i++) {
    	for(int j = 1; j < n+1; j++) {
    		arr[i][j] = kb.nextInt();
    	}
    }
    
    T.solution(arr,n);
  }
}