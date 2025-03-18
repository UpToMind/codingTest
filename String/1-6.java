import java.util.*;

public class Main {
    
    public String solution(String str) {
    
        char[] arr = str.toCharArray();
  	    LinkedHashSet<Character> set = new LinkedHashSet<>();
    
        for(char c : arr) {
    	    set.add(c);
        }
    
        StringBuilder sb = new StringBuilder();
        for(Character c : set) {
    	    sb.append(c);
        }
    
        return sb.toString();

    }
    
    public static void main(String[] args) {
        Main T = new Main();
        // 문자열 입력
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        // 문자열 출력
        System.out.print(T.solution(str));
    }
}