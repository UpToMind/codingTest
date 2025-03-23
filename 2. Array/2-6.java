import java.util.Scanner;
  
public class Main {
  public boolean isPrime(int num) {
    if(num == 1) return false;
    
  	for(int i = 2; i*i <= num; i++) {
    	if(num % i == 0) return false;
    }
    
    return true;
  }
  
  public void solution(String[] arr, int n) {
  	int[] nums = new int[n];
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < n; i++) {
    	String reversed = new StringBuilder(arr[i]).reverse().toString();
      	nums[i] = Integer.parseInt(reversed);
    }
    
    for(int i = 0; i < n; i++) {
    	if(isPrime(nums[i])) System.out.print(nums[i] + " ");
    }
    
    
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] arr = new String[n];
    for(int i = 0; i < n; i++) {
    	String temp = kb.next();
      	arr[i] = temp;
    }
    
    T.solution(arr,n);
  }
}