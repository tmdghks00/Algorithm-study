import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int k = in.nextInt();
		int idx = 0;
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			arr[i] = a;
				
			
		}
		Arrays.sort(arr);
		
		
		
		System.out.println(arr[arr.length-(k)]);
	}
}