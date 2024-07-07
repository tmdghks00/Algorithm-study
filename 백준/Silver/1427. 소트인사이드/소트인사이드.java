import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		char[] arr = in.nextLine().toCharArray();
// toCharArray() 메서드는 문자열을 문자(char) 배열로 변환
		Arrays.sort(arr);
 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
 
	}
}
