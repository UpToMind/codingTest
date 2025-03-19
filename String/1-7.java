import java.util.*;

public class Main {
    public String solution(String str) {
        str = str.toUpperCase();  
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right) {
            if(arr[left] != arr[right]) {  
                return "NO";
            }
            left++;  
            right--;  
        }
        return "YES";  
    }
    
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        
        System.out.print(T.solution(str));
    }
}