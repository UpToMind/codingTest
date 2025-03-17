import java.util.*;

public class Main {
    public String solution(String str) {
        char[] arr = str.toCharArray(); // 문자열을 문자 배열로 변환
        int left = 0;                   // 왼쪽 포인터
        int right = arr.length - 1;     // 오른쪽 포인터
        
        // 양쪽에서 시작해 알파벳만 뒤집기
        while (left < right) {
            // 왼쪽이 알파벳이 아니면 건너뜀
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }
            // 오른쪽이 알파벳이 아니면 건너뜀
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }
            // 알파벳이면 서로 교환
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr); // 결과 문자열 반환
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}