import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { 
				arr[s.charAt(i) - 97]++; // 소문자라면 97을 뺀 인덱스값임
			} else {
				arr[s.charAt(i) - 65]++; // 대문자라면 65를 뺀 인덱스값임
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
// char 형 타입의 변수에 int 와 char 을 연산하여 저장할 경우 반드시 캐스팅을 해야함			
			} 
			else if (arr[i] == max) {
				ch = '?'; // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우
			}
		}
		System.out.print(ch);
	}
 
}