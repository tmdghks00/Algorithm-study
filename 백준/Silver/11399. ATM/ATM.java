import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 사람의 수	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				 
		
		int[] arr = new int[1001]; // 입력의 범위는 1 ~ 1000 임
		
		// Counting Sort = 입력 범위가 제한적인 경우에 효율적인 정렬 알고리즘. 
		// 입력 데이터의 빈도수를 기반으로 정렬 수행.
		
				while (N-- > 0) { // N번 반복하여 각 사람의 인출 시간 입력 처리
					arr[Integer.parseInt(st.nextToken())]++;
// 두 번째 줄 입력 (각 사람의 인출 시간)을 공백으로 분리하여 읽어온 후, 해당 인출 시간에 해당하는 배열 요소 값을 1 증가시킴 (Counting Sort).					
				}
		 
				int prev = 0;	// 이전까지의 대기시간 누적합
				int sum = 0;	// 사람별 대기시간 총합
				
				for (int i = 0; i < 1001; i++) {
					
					// 해당 i index가 0이 될 때 까지 반복 
					while (arr[i]-- > 0) { // 해당 인출 시간(i)을 가진 사람 수만큼 반복

						sum += (i + prev); // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
						
						prev += i; // 현재 사람의 인출 시간을 이전까지의 누적 대기 시간에 더하여 갱신.
					}
				}
				System.out.println(sum);
			}
		 
		}