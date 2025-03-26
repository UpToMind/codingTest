import java.util.*;

public class Main {
    public void solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();  // 학생 수
        int m = kb.nextInt();  // 테스트 횟수
        int[][] arr = new int[m][n];  // 테스트 결과 배열
      
        // 테스트 결과 입력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
      
        int count = 0;  // 가능한 (멘토, 멘티) 쌍의 수
        
        for (int i = 1; i <= n; i++) {  // i: 멘토 후보
            for (int j = 1; j <= n; j++) {  // j: 멘티 후보
                if (i == j) continue;  // 같은 학생은 제외
                
                boolean isValid = true;
                for (int k = 0; k < m; k++) {
                    int rankI = -1;
                    int rankJ = -1;
                    // 현재 테스트에서 i와 j의 등수 찾기
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) rankI = l;
                        if (arr[k][l] == j) rankJ = l;
                    }
                    // i가 j보다 등수가 뒤에 있거나 같으면 멘토 불가능
                    if (rankI >= rankJ) {
                        isValid = false;
                        break;  // 더 확인할 필요 없음
                    }
                }
                if (isValid) count++;  // 모든 테스트에서 조건 만족 시 증가
            }
        }
      
        System.out.print(count);
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        T.solution();
    }
}