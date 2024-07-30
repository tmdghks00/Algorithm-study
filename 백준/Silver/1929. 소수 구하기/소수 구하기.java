import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
 
public class Main {
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N + 1];
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = M; i <= N; i++) {
			// false = 소수 
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
 
	public static void get_prime() { // 에라토스테네스의 체 알고리즘
		// true = 소수아님 , false = 소수 
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
// 배열의 제곱근까지만 탐색하여 효율성을 높임			
			if(prime[i]) continue; // i가 소수가 아니면 다음으로 건너뜀
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true; // i의 배수는 소수가 아님
			}
		}
	}
}
 