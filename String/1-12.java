import java.util.*;

public class Main {
    public String solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();  // 문자의 개수 입력
        String signal = kb.next();  // 신호 문자열 입력
        
        StringBuilder answer = new StringBuilder();
        
        // 각 문자는 7자리로 구성되어 있으므로 7자리씩 끊어서 처리
        for(int i = 0; i < n; i++) {
            // 7자리 substring 추출
            String temp = signal.substring(i * 7, (i * 7) + 7);
            
            // 이진수로 변환 (# -> 1, * -> 0)
            String binary = "";
            for(char c : temp.toCharArray()) {
                if(c == '#') binary += "1";
                else binary += "0";
            }
            
            // 이진수를 10진수로 변환
            int decimal = Integer.parseInt(binary, 2);
            
            // 10진수를 문자로 변환
            char letter = (char)decimal;
            
            answer.append(letter);
        }
        
        return answer.toString();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        System.out.print(T.solution());
    }
}