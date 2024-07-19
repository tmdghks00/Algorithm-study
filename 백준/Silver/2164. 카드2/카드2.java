import java.util.Queue;
import java.util.LinkedList;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			q.offer(i); // 큐에다가 순서대로 1부터 N까지 넣는 과정임
		}
		
		
		while(q.size() > 1) { // 카드가 1개 남을때까지 반복
			q.poll();	// 맨 앞의 원소 버림 
			q.offer(q.poll());	// 맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입 
		}
		
		System.out.println(q.poll());	// 마지막으로 남은 원소 출력 
	}
}