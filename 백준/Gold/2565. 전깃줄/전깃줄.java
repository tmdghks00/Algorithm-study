import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
 
	static Integer[] dp;
	static int[][] wire;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N]; // 메모이제이션 할 배열
		wire = new int[N][2]; // A와 B전봇대를 의미하는 2차원 배열
		//  wire[N][0] 이 A전봇대, wire[N][1] 이 B전봇대	
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 첫 번째 원소(A전봇대)를 기준으로 오름차순으로 정렬
		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
 
 
		int max = 0;
		
		/*
		 *  i번째 A전봇대를 기준으로 연결가능한 개수 탐색
		 *  및 최댓값 찾기
		 */
		 
		for(int i = 0; i < N; i++) {
			max = Math.max(recur(i), max);
		}
		
		// (전체 전선 개수 - 설치 가능 개수) = 없애야하는 전깃줄의 개수
		System.out.println(N - max); // 없애야하는 전깃줄의 개수
		
	}
	
	
	static int recur(int N) {
		
		// 탐색하지 않았던 위치라면 
		if(dp[N] == null) {
			
			dp[N] = 1;	// 최솟값 1로 초기화 
			
			// A의 N번째와 이후의 전봇대들 비교 
			for(int i = N + 1; i < dp.length; i++) {
				
				/*
				 *  A전봇대의 N번째 전선이 연결되어있는 B전봇대보다 A의 i번째
				 *  전봇대의 전선이 이어진 B전봇대가 뒤에 있을 경우 
				 *  전선을 설치할 수 있음 
				 */
				if(wire[N][1] < wire[i][1]) {
					// 연결 가능한 전선의 경우의 수 중 큰 값을 dp에 저장한다.
					dp[N] = Math.max(dp[N], recur(i) + 1);
				}
			}
		}
		return dp[N];
	}
	
 
}
