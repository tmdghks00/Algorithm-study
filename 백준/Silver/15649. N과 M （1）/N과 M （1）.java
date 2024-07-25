import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] vi;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		vi = new boolean[N];
		dfs(N, M, 0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int N, int M, int dep) {
		if (dep == M) { // 재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!vi[i]) { // 해당 노드를 방문하지 않은경우
				vi[i] = true; // 해당 노드를 방문상태로 변경
				arr[dep] = i + 1; 
				dfs(N, M, dep + 1); // dep 1 증가후 재귀호출
				vi[i] = false; 
			}
		}
	}
 
}