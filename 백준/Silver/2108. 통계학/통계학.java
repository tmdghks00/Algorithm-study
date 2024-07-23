import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		double sum  = 0;
		
		for(int i = 0 ; i < N ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i]; // N개의 수들의 합 구하기
		}
		
		Arrays.sort(nums); // 배열 오름차순 정렬
		
		int count = 0; // 현재 연속으로 등장한 같은 숫자의 개수를 저장
		int max = -1; // 최빈값의 등장 횟수를 저장
		int mod = nums[0]; // 최빈값을 저장
		
		boolean ch = false;
		
		for(int i = 0; i < N - 1; i++) { // 최빈값을 구하는 반복문
			if(nums[i] == nums[i + 1]) {
				count++;
			}else {
				count = 0;
			}
// 배열이 오름차순 정렬되어 있으므로 현재 숫자가 다음 숫자와 같다면 count를 증가	
	 		if(max < count) {
				max = count;
				mod = nums[i];
				ch = true;
// 현재 count가 max보다 크다면, 새로운 최빈값이므로 max를 업데이트하고 mod를 현재 숫자로 설정				
			}else if(max == count && ch == true) {
// 현재 count가 max와 같고 ch가 true라면, 두 번째로 등장한 최빈값을 찾은 것임				
				mod = nums[i]; // mod를 현재 숫자로 업데이트
				ch = false;
			}
		}
		System.out.println(Math.round(sum / N)); 	 // 산술평균
		System.out.println(nums[(N- 1) / 2]); 	 // 중앙값
		System.out.println(mod); 			 		 // 최빈값
		System.out.println(nums[N - 1] - nums[0]); // 최대값 - 최소값
	}
}