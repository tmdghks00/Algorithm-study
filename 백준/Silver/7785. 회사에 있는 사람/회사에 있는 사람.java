import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<String, String> m = new HashMap<String, String>();
		
		for (int i = 0; i < N; i++) 
		{
			String name = sc.next();
			String log = sc.next();
			if (m.containsKey(name)) m.remove(name); //최초 입력이 아니면 나간거
			else m.put(name, log); //최초 입력이면 들어온거
		}
		ArrayList<String> list = new ArrayList<String>(m.keySet()); //Hash맵의 Key들을 ArrayList로 변경
		Collections.sort(list, Collections.reverseOrder()); //내림차순으로 정렬
		for(int i = 0; i < list.size(); ++i) System.out.println(list.get(i));
	}
}