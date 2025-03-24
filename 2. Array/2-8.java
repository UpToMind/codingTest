import java.util.*;

public class Main {
    public void solution(int[] arr, int n) {
        int[] rank = new int[n];  // 등수를 저장할 배열
        
        // 모든 학생의 점수를 비교하여 등수 계산
        for(int i = 0; i < n; i++) {
            int count = 1;  // 기본 등수는 1부터 시작
            for(int j = 0; j < n; j++) {
                // 현재 학생(i)의 점수보다 높은 점수가 있으면 등수 증가
                if(arr[i] < arr[j]) {
                    count++;
                }
            }
            rank[i] = count;  // 계산된 등수를 배열에 저장
        }
        
        // 결과 출력
        for(int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(arr, n);
    }
}