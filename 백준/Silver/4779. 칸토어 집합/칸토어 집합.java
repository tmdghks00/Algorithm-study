import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while ((str = br.readLine()) != null) {
// 입력이 null이 아닐 때까지 계속 반복하여 여러 테스트 케이스를 처리			
			n = Integer.parseInt(str);
			sb =new StringBuilder();
			
			int len = (int) Math.pow(3, n);

			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			// -가 3^N개 있는 문자열에서 시작
			
			func(0, len); // 시작 인덱스, 시작 길이
			System.out.println(sb);

		}
	}

	public static void func(int start,int size) { //시작 인덱스, 문자열 크기
		
		if(size==1) { //문자열 크기가 1이되면 쪼갤수 없으므로 리턴
			return;
		}
		
		int newSize=size/3; // 현재 문자열을 3등분
		
        // 3등분한 문자열의 2번째 부분 공백처리
		
		for(int i=start+newSize; i<start+2*newSize; i++) {
			 sb.setCharAt(i, ' ');
		}
// 재귀 호출을 통해 첫 번째 부분과 세 번째 부분을 다시 칸토어 집합 규칙에 따라 변환		
		func(start, newSize); // 3등분한 문자열에서 첫번째 부분
		func(start+2*newSize, newSize); // 3등분한 문자열의 세번째 부분 
	}

}