import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		seq = new int[N]; // 입력받은 수열을 저장
		dp = new Integer[N]; // 각 인덱스 에서 끝나는 LIS의 길이를 저장		
// dp[i]는 seq[i]에서 끝나는 LIS의 길이를 의미
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		// 0 ~ N-1 까지 탐색 
// for 루프를 통해 각 인덱스 i에 대해 LIS(i)를 호출하여 dp 배열을 채움		
		for(int i = 0; i < N; i++) {
			LIS(i); // i번째 인덱스에서 끝나는 LIS의 길이를 계산
// LIS 메서드는 재귀적으로 호출되며 메모이제이션을 활용하여 이미 계산된 값은 계산하지 않음		
		}
		
		int max = dp[0];
		// 최댓값 찾기 
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i]); 
		} // dp 배열에서 최댓값을 찾아 출력
		System.out.println(max);
	}
	
	
	static int LIS(int N) { //인덱스 N에서 끝나는 LIS의 길이를 계산
		
		// 만약 탐색하지 않던 위치의 경우 
		if(dp[N] == null) { //  아직 계산되지 않았음을 의미
			dp[N] = 1;	// 1로 초기화 
		// 모든 부분수열의 길이는 최소한 1 이상이기 때문			
			
		// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
			for(int i = N - 1; i >= 0; i--) {
				// 이전의 노드 중 seq[N]의 값보다 작은 걸 발견했을 경우
				if(seq[i] < seq[N]) {
					dp[N] = Math.max(dp[N], LIS(i) + 1);
// +1을 하는 이유는 dp[N]이 이전 부분수열에 N번째 원소가 추가되었다는 의미이기 때문					
				}
			}
		}
		return dp[N];
	}
}