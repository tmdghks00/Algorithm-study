import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); //M이상
		int N = Integer.parseInt(br.readLine()); //N이하
		int sum = 0;
		int min = N;
		 x : for (int i = M; i <= N; i++) { //N회만큼 반복
			if (i == 1) { //1은 소수가 아님
				continue;
			}
			for (int j = 2; j < i; j++) { //2~i-1까지의 수랑 i랑 나눠서 나머지가 0이면 소수가 아니므로 for문 스킵.
				if (i % j == 0) {
					continue x;
				} 
			}
			sum += i;
			if (min > i) {
				min = i;
			}
		}
		if (sum == 0 ) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum + "\n" + min);
		
	}

}