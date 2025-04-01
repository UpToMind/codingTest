import java.util.*;

public class Main {
    public void solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        // 카드 입력
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        // 3장의 합을 저장할 TreeSet (내림차순)
        TreeSet<Integer> sums = new TreeSet<>(Collections.reverseOrder());

        // 3중 반복문으로 모든 조합의 합 계산
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    sums.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        // K번째 큰 수 찾기
        int count = 0;
        int result = -1;
        for (int sum : sums) {
            count++;
            if (count == k) {
                result = sum;
                break;
            }
        }

        // 결과 출력
        System.out.print(result);
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution();
    }
}