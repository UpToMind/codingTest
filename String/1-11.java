import java.util.*;

public class Main {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1; // 연속된 문자 횟수
        
        // 문자열 끝에 더미 문자 추가 (마지막 그룹 처리용)
        str = str + " ";
        
        for (int i = 0; i < str.length() - 1; i++) {
            // 다음 문자와 비교
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++; // 같은 문자면 카운트 증가
            } else {
                // 다른 문자면 지금까지의 결과 추가
                sb.append(str.charAt(i)); // 문자 추가
                if (count > 1) {
                    sb.append(count); // 반복 횟수가 1보다 크면 추가
                }
                count = 1; // 카운트 초기화
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}