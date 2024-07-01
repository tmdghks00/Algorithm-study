import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		Long X = in.nextLong();
		in.close();
		
		if(X == 1) {
			System.out.println(1);
			return;
		}
		
		long cnt = 1;
		long sum = 1;
		long idx = 6;
		
		while(sum < X) {
			sum += idx;
			cnt += 1;
			idx += 6;				
		}
		
		
		System.out.println(cnt);
			
		
	}
}