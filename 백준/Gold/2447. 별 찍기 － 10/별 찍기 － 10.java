import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	static char[][] arr;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		arr = new char[N][N];
        
		st(0, 0, N, false);
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	  //시작 x축, 시작 y축, 크기 N, 공백 여부
	static void st(int x, int y, int N, boolean blank) {
 
		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' '; 
				}
			}
			return;
		}
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			arr[x][y] = '*'; //더이상 쪼갤 수 없는 값이므로 * 이다
			return;
		}
 
		// N은 3의 거듭제곱 이므로 3으로 나눔
		int size = N / 3; //  해당 블록의 한 칸을 담을 변수
		int count = 0; //  별 출력 누적
		
		//반복문의 증가값은 블록사이즈만큼 증가해야한다.
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					st(i, j, size, true);
				} else {
					st(i, j, size, false);
				}
			}
		}
	}
}