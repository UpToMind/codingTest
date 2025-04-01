import java.util.*;

public class Main{
	public void solution(){
		Scanner kb = new Scanner(System.in);
      	String str1 = kb.next();
      	String str2 = kb.next();
      	HashMap<Character, Integer> map1 = new HashMap<>();
      	HashMap<Character, Integer> map2 = new HashMap<>();
      
      	for(char x : str1.toCharArray()){
        	map1.put(x, map1.getOrDefault(x,0)+1);
        }
      	
      	for(char x : str2.toCharArray()){
        	map2.put(x, map2.getOrDefault(x,0)+1);
        }
      
      	if(map1.equals(map2)) System.out.print("YES");
      	else System.out.print("NO");
	}
	
	public static void main(String[] args){
		Main T = new Main();
		T.solution();
	}

}