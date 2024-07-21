import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=num; // 초기값은 단어의수로 설정


		for(int r = 0; r<num; r++) {  
			String st = sc.next(); // 문자열 입력
			boolean test[] = new boolean[26]; 

			for(int i=0; i<st.length()-1; i++) { 
				if(st.charAt(i)!=st.charAt(i+1)) { 
					if(test[st.charAt(i+1)-97]==true) { 
						cnt--; // 그룹단어가 아닐시 -1 
						break; 
					}
				}
				test[st.charAt(i)-97]=true; 
			}
		}
		System.out.println(cnt);
	}
}


