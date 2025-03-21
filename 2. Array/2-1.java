import java.util.*;

public class Main {
    public String solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        
        // 배열에 입력값 저장
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        
        StringBuilder answer = new StringBuilder();
        // 첫 번째 수는 무조건 출력
        answer.append(arr[0] + " ");
        
        // 두 번째 수부터 이전 수와 비교
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) {
                answer.append(arr[i] + " ");
            }
        }
        
        return answer.toString().trim();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        System.out.print(T.solution());
    }
}