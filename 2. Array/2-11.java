import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public void solution(int[][] arr, int n) {
        int[] students = new int[n]; // 각 학생별 같은 반이었던 학생 수 저장
        
        // 각 학생에 대해
        for (int i = 0; i < n; i++) {
            HashSet<Integer> sameClass = new HashSet<>(); // 중복 제거를 위한 HashSet
            // 각 학년별로
            for (int j = 0; j < 5; j++) {
                // 다른 학생들과 비교
                for (int k = 0; k < n; k++) {
                    if (i != k && arr[i][j] == arr[k][j]) {
                        sameClass.add(k); // 같은 반이었던 학생 번호 추가
                    }
                }
            }
            students[i] = sameClass.size(); // 중복 제거된 학생 수 저장
        }
        
        // 최대값과 해당 학생 번호 찾기
        int max = -1;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (students[i] > max) {
                max = students[i];
                idx = i;
            }
        }
        
        System.out.print(idx + 1); // 학생 번호는 1부터 시작
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5]; // 5학년 고정
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        
        T.solution(arr, n);
    }
}