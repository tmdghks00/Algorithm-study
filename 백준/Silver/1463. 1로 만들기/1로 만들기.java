import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		System.out.println(recur(N, 0));
	}
	
	
 // count = 최솟값으로 연산을 하는 횟수 
	static int recur(int N, int count) {
		// N이 2 미만인 경우 누적된 count값을 반환
		   
		/*
		 N으로 각각 2와 3으로 나누면 count는 +1에 각 연산의
		 나머지 값을 더해준 것이 된다.
		 나머지 값은 빼기 1했을 때의 count 값과 같기 때문
		*/
		
		if (N < 2) {
		// N=1 까지 count를 누적했다가 1이 되면 누적된 count를 반환하여 재귀를 탈출			
			return count;
		}
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
		// 현재 연산을 하나 수행한 것이기 때문에 연산 횟수(count)를 1 증가
	}
}