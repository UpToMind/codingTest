import java.util.*;
  
public class Main {
  public void solution(){
  	Scanner kb = new Scanner(System.in);
    
    int n = kb.nextInt();
    int[] arr1 = new int[n];
    HashSet<Integer> set1 = new HashSet<>();
    for(int i = 0; i < n; i++) {
    	arr1[i] = kb.nextInt();
      	set1.add(arr1[i]);
    }
    
    int m = kb.nextInt();
    int[] arr2 = new int[m];
    HashSet<Integer> set2 = new HashSet<>();
    for(int i = 0; i < m; i++) {
    	arr2[i] = kb.nextInt();
      	set2.add(arr2[i]);
    }
    
    HashSet<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);
   
    TreeSet<Integer> sortedSet = new TreeSet<>(intersection);
    int size = sortedSet.size();
    int count = 0;
        for (Integer num : sortedSet) {
            System.out.print(num);
            if (count++ < size - 1) System.out.print(" ");  // 마지막 공백 제거
        }
    
  }
  
  public static void main(String[] args){
    Main T = new Main();
    T.solution();
  }
}