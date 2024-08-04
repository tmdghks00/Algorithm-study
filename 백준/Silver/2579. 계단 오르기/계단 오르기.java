import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	static Integer dp[];
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N + 1]; 
		// 동적 계획법을 사용하여 각 계단까지의 최대 점수를 저장하는 배열.
		arr = new int[N + 1]; 
		// 계단의 점수를 저장하는 배열
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 재귀 dp는 int[] 배열이 아닌 Integer[] 객체배열을 쓸 것이다.
		dp[0] = arr[0];	// 디폴트값이 null이므로 0으로 초기화 해주어야한다.
		dp[1] = arr[1]; // 첫 번째 계단까지의 최대 점수는 첫 번째 계단의 점수와 동일
		
		// N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
		if(N >= 2) {
			dp[2] = arr[1] + arr[2];
// 두 번째 계단까지의 최대 점수는 첫 번째 계단과 두 번째 계단을 연속으로 밟는 경우의 점수임			
			//  dp[n] 은 n까지 밟았을 때 가질 수 있는 계단 가치의 최대합			
		}
		
		System.out.println(find(N));
		
	}
	
	static int find(int N) {
		// 아직 탐색하지 않는 N번째 계단일 경우
		if(dp[N] == null) {
			dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
// 두 계단을 한 번에 올라가는 경우와 한 계단 건너서 두 번에 걸쳐 올라가는 경우 중 최대 점수를 선택	
// 마지막에 arr[N] 을 더하는 이유는 마지막 도착 계단은 밟아야 하기 때문이다		
		}
		
		return dp[N];
	}
	 
}