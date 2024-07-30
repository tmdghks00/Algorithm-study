import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	/*
	n > 123456 이므로 2n 은 최대 246912 이다.
	0 부터 시작하므로 246912 + 1
	*/
	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();	// 소수를 얻는 메소드 실행
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break; // n 이 0 일경우 종료
			
			int cnt = 0; 	// 소수 개수를 셀 변수
			
			for (int i = n+1; i <= 2*n ; i++) {
				if(!prime[i]) cnt++;
			}
			System.out.println(cnt);			
		}				
		
	}
	// 소수를 얻는 메소드
	public static void get_prime() { // 에라토스테네스의 체 알고리즘
		// true = 소수아님 , false = 소수 
		prime[0] = prime[1] = true; // 0 과 1 은 소수가 아니므로 ture
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			// 배열의 제곱근까지만 탐색하여 효율성을 높임			
			if(prime[i]) continue; // i가 소수가 아니면 다음으로 건너뜀
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true; // i의 배수는 소수가 아님
			}
		}
	}
}
 