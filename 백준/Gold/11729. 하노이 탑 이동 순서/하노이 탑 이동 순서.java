import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		
		// 일반항 공식 정의
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		HanoiTop(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
	public static void HanoiTop(int N, int start, int mid, int to) {
		
		if (N == 1) { // 이동할 원판의 수가 1개인 경우
			sb.append(start + " " + to + "\n");
			return;
		}
 
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		HanoiTop(N - 1, start, to, mid);
    
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(start + " " + to + "\n");
    
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		HanoiTop(N - 1, mid, start, to);
	}
}