import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	
	static Integer[] dp;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N + 1]; // 동적 계획법을 사용하여 각 포도주잔까지의 최대 점수를 저장하는 배열.
		arr = new int[N + 1]; // 포도주의 양을 저장하는 배열
		
		for(int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		/*
		 *  N이 1로 주어질 수 있으므로 이럴 때를 위해 조건식을 달아둔다.
		 *  또한 dp[2]는 어떤 경우에도 첫 번째와 두 번째를 합한 것이 최댓값이다. 
		 */
		if(N > 1) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(recur(N));
	}
	
	static int recur(int N) {
		
		if(dp[N] == null) {
			dp[N] = Math.max(Math.max(recur(N - 2), recur(N - 3) + arr[N - 1]) + arr[N], recur(N - 1));
// 각 노드는 이전의 최댓값과 비교하게 되며 조합 가능한 것 중 최댓값만을 저장하게됨		
		}
		
		return dp[N];
	}
}
 