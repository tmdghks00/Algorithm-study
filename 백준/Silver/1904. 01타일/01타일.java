import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static int[] dp = new int[1000001];;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
 
		// -1 로 초기화
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1; // 나머지값이 0일수도 있기때문에 초기화가 필요함
		} // 배열 비어있는 표시는 -1 이라고 가정
		
		System.out.println(Tile(N));
		
	}
	
	public static int Tile(int N) {
		
		if(dp[N] == -1) { // 해당 배열에 값이 없을경우 재귀호출
			dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746;
		}
		return dp[N];
	}
 
}