import java.util.Scanner;
  
public class Main {
  public void solution() {
  	Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] infoA = new int[n];
    int[] infoB = new int[n];
    
    for(int i = 0; i < n; i++) {
    	infoA[i] = kb.nextInt();
    }
    
    for(int i = 0; i < n; i++) {
    	infoB[i] = kb.nextInt();
    }
    
    for(int i = 0; i < n; i++) {
    	if(infoA[i] == infoB[i]) {
        	System.out.println("D");
        }
      	
      	else {
        	if(infoA[i] == 1) {
            	if(infoB[i] == 2) {
                	System.out.println("B");
                }
              	
              	else {
                	System.out.println("A");
                }
            }
          
          	if(infoA[i] == 2) {
            	if(infoB[i] == 3) {
                	System.out.println("B");
                }
              	
              	else {
                	System.out.println("A");
                }
            }
          
          	if(infoA[i] == 3) {
            	if(infoB[i] == 1) {
                	System.out.println("B");
                }
              	
              	else {
                	System.out.println("A");
                }
            }
        }
      	
    }
  }
  
  public static void main(String[] args){
    Main T = new Main();
    T.solution();
  }
}