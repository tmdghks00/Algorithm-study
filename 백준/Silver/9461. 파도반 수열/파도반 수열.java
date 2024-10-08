import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	
	public static Long[] seq = new Long[101];
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) { // 이 while 문은 T번 실행
			sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
		}
		System.out.println(sb);
	}
	
	public static long padovan(int N) {
		if(seq[N] == null) { // 해당 배열에 값이 없을경우 재귀호출
			seq[N] = padovan(N - 2) + padovan(N - 3);
		}
		return seq[N];
	}
 
}