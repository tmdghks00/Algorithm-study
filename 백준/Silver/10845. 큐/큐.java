import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<Integer>();
		int lastnum = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String Str = st.nextToken();
			
			switch(Str) {
			case "push" : //큐에 x 삽입
				lastnum = Integer.parseInt(st.nextToken());
				q.offer(lastnum);
				break;
			case "pop" : //큐 첫번째 숫자 빼내기
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.poll()).append("\n");
				break;
			case "size" : //큐 사이즈 출력
				sb.append(q.size()).append("\n");
				break;
			case "empty" : //큐가 비어있으면 1, 비어있지 않으면 0 출력
				if(q.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "front" : //큐가 비어있으면 -1 출력. 비어있지 않으면 첫번째 숫자 출력
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.peek()).append("\n");
				break;
			case "back" : //큐가 비어있으면 -1 출력. 비어있지 않으면 마지막 숫자 출력
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(lastnum).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
}