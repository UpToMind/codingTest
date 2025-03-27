import java.util.Scanner;
  
public class Main {
  public void solution(){
  	Scanner kb = new Scanner(System.in);
    
    int n = kb.nextInt();
    int[] arr1 = new int[n];
    
    for(int i = 0; i < n; i++) {
    	arr1[i] = kb.nextInt();
    }
    
    int m = kb.nextInt();
    int[] arr2 = new int[m];
    
    for(int i = 0; i < m; i++){
    	arr2[i] = kb.nextInt();
    }
    
    int p1 = 0;
    int p2 = 0;
    int idx = 0;
    int[] result = new int[n+m];
    
    while(p1 < n && p2 < m) {
    	if(arr1[p1] >= arr2[p2]) {
        	result[idx++] = arr2[p2++];
        }
      	else {
        	result[idx++] = arr1[p1++];
        }
    }
    
    while(p1 < n) {
    	result[idx++] = arr1[p1++];
    }
    
    while(p2 < m) {
    	result[idx++] = arr2[p2++];
    }
    
    for(int i = 0; i < m+n; i++){
    	System.out.print(result[i]);
      	if(i < m+n-1) System.out.print(" ");
    }
    
  }
  
  public static void main(String[] args){
    Main T = new Main();
    T.solution();
  }
}