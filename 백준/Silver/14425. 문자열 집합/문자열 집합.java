import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
		int cnt = 0;
		String arr[] = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.next();
		}
		
			for (int j = 0; j < M; j++) {
				String st = in.next();
				for (int k = 0; k < arr.length; k++) {
					if(arr[k].equals(st)) {
						cnt = cnt + 1;
						break;
					}
				}
 
			}
				in.close();
				System.out.println(cnt);
		
	
	}
}