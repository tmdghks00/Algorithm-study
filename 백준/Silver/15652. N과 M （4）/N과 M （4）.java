import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		Back(1, 0);
		System.out.println(sb);
	}
 // start = 시작하는 위치를 의미하는 변수 , depth = 깊이를 의미하는 변수
	public static void Back(int start, int depth) {
 
		if (depth == M) { // 깊이가 M일 경우 출력
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = start; i <= N; i++) {
			arr[depth] = i; // 현재 깊이를 index로 하여 해당 위치에 i 값을 담기
			Back(i, depth + 1); // 깊이를 1 증가시켜서 재귀호출
		}
	}
 
}