import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt(); //  전체 사람의 수 입력
 
		int[][] arr = new int[N][2]; // 사람의 몸무게와 키를 나타내는 배열
 
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();	// [i][0] : 몸무게 
			arr[i][1] = in.nextInt();	// [i][1] : 키 
		}
		
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) continue; // 같은 사람은 비교하지않고 넘어감				
			
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++; // i번째 사람보다 j번째 사람이 덩치가 크면 rank 증가
				}
			}
 
			System.out.print(rank + " "); // i의 덩치 등수를 출력
		}
 
	}
}