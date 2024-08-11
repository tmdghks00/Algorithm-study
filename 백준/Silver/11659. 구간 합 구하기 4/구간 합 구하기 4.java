import java.util.*;
import java.io.*;

class Main {
	
	static int[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 수의 개수
		int M = Integer.parseInt(st.nextToken()); // 합을 구해야하는 횟수
		
		st = new StringTokenizer(br.readLine());
		arr = new int[N+1]; // 주어진 N개의 수를 저장하는 배열
		
// n개의 누적합은 변하지 않으므로 한 번만 계산해놓고 필요한 부분을 뽑아서 쓴다.		
		for(int i=1; i<=N; i++) { // i까지의 누적합 구하기
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			// a와 b는 합을 구해야 하는 구간임
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// a, b사이의 구간합은 array[b]-array[a-1]과 같다
			System.out.println(arr[b] - arr[a-1]);
		}
	}
	
	
}