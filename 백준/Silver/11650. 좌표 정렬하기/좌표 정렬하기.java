import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
//아래 방식은 만약 X좌표가 같다면 Y좌표를 비교하고
//그게 아니면 그냥 바로 반환을 해주는 Comparator 비교 방법이다
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
// e1[1] - e2[1]이 양수라면 el[1]이 더큰수이므로 e2 뒤에 위치하게 된다
// e1[1] - e2[1];은 첫 번째 요소가 동일한 경우 두 번째 요소를 기준으로 
// 정렬하기 위해 사용되는 비교 연산입니다.
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}