import java.util.*;

public class Main {
    public void solution() {
        Scanner kb = new Scanner(System.in);
        String S = kb.nextLine(); // 첫 번째 문자열
        String T = kb.nextLine(); // 두 번째 문자열

        int k = T.length(); // 윈도우 크기
        int count = 0; // 아나그램 개수

        // T의 문자 빈도수 저장
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : T.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        // 첫 번째 윈도우 초기화
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char c = S.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
        }
        if (windowMap.equals(targetMap)) count++;

        // 슬라이딩 윈도우로 나머지 확인
        for (int i = 1; i <= S.length() - k; i++) {
            // 이전 윈도우의 첫 문자 제거
            char prev = S.charAt(i - 1);
            windowMap.put(prev, windowMap.get(prev) - 1);
            if (windowMap.get(prev) == 0) windowMap.remove(prev);

            // 새 윈도우의 마지막 문자 추가
            char next = S.charAt(i + k - 1);
            windowMap.put(next, windowMap.getOrDefault(next, 0) + 1);

            // 현재 윈도우가 T와 아나그램인지 확인
            if (windowMap.equals(targetMap)) count++;
        }

        System.out.println(count);
        kb.close();
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution();
    }
}