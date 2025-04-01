import java.util.*;

public class Main {
    public void solution() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n]; // ArrayList 대신 배열 사용
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        // 첫 번째 윈도우 계산
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[] answer = new int[n - k + 1];
        answer[0] = map.size();

        // 슬라이딩 윈도우로 나머지 계산
        for (int i = 1; i < n - k + 1; i++) {
            // 이전 윈도우의 첫 번째 요소 제거
            int prev = arr[i - 1];
            map.put(prev, map.get(prev) - 1);
            if (map.get(prev) == 0) map.remove(prev);

            // 새 윈도우의 마지막 요소 추가
            int next = arr[i + k - 1];
            map.put(next, map.getOrDefault(next, 0) + 1);

            answer[i] = map.size();
        }

        // 출력
        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(answer[i] + " ");
        }
        kb.close();
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution();
    }
}