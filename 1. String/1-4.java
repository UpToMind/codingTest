import java.util.*;

public class Main {
    public String solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        StringBuilder result = new StringBuilder();
        
        // N개의 단어를 처리
        for (int i = 0; i < n; i++) {
            String word = kb.next(); // 단어를 입력받음
            // 단어를 뒤집고 결과에 추가
            String reversed = new StringBuilder(word).reverse().toString();
            result.append(reversed).append("\n");
        }
        
        return result.toString(); // 최종 결과 반환
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        System.out.print(T.solution());
    }
}