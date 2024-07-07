import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = in.nextInt();
			arr[i] = a;
				sum += arr[i];
		}
		Arrays.sort(arr);
		
		int avg = sum/5;
		int mid = arr[arr.length/2];
		System.out.println(avg);
		System.out.println(mid);
		
	}
}