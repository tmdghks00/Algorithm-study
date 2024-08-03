import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	static int[][] arr;
	static Integer[][] dp;
	static int N;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		N = Integer.parseInt(br.readLine());
 
		arr = new int[N][N]; // 삼각형을 입력받을 2차원 arr 배열
		dp = new Integer[N][N]; // 경로 합을 갖을 DP 배열
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		// 삼각형의 밑변, 즉 마지막 값은 DP배열에도 똑같이 저장			
		}
 
		System.out.println(find(0, 0));
 
	}
	
	// depth는 깊이(행), idx는 인덱스(열)를 의미
	static int find(int depth, int idx) {
		
		// 만약 맨 밑(깊이)의 행에 도달하면 해당 인덱스를 반환한다.
		if(depth == N - 1) return dp[depth][idx];
 
		// 만약 아직 탐색하지 않은 위치라면 다음 행의 양쪽 열 중 최댓값을 구함
		if (dp[depth][idx] == null) {
			/*
			 바로 다음행의 인덱스와 그 오른쪽의 인덱스 중 
			 큰 값 찾아 dp에 현재 인덱스의 값과 더하여 저장
			*/
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
 
	}
}