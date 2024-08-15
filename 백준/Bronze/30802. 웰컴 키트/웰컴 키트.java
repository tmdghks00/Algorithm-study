import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 참가자의 수
		int[] a = new int[6]; // 티셔츠 사이즈별 신청자의 수를 저장하는 배열
		
		for(int i = 0; i < 6; i++) {
			a[i] = sc.nextInt(); // 티셔츠 사이즈별 신청자의 수 입력받기
		}
		int t = sc.nextInt(); // 티셔츠 한 묶음
		int p = sc.nextInt();  // 펜의 한 묶음
		
		int count = 0;
		for(int i = 0; i < 6; i++) {
			count += a[i] / t;
			if(a[i] % t != 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(n / p + " " + n % p);
		sc.close();
	}
}