import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Queue<Integer> q = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			q.add(i); // 큐에다가 순서대로 1부터 N까지 넣는 과정임
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		/*
		 *  마지막 부분의 출력은 > 괄호 전에 공백이 없기 때문에
		 *  일괄적으로 출력하기 위해 마지막 원소만 남겨질 때까지만
		 *  반복하고 마지막 원소는 그대로 출력한다.
		 */
		while(q.size() > 1) { // 카드가 1개 남을때까지 반복
			for(int i = 0; i < K - 1; i++) {
				q.offer(q.poll()); 
			}
// K번 쨰 수가 되기 직전까지 맨 앞의 원소를 K-1 번 꺼내오고(poll) 
// 꺼내온 원소들을 맨 뒤로 넣는다.(offer)			
			sb.append(q.poll()).append(", "); 
		}
		// 마지막 원소 출력한 뒤 > 도 붙여준다.
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
}