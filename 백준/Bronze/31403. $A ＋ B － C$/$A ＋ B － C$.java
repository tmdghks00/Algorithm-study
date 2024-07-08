import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int sum = 0;
		int sum2 = 0;
		String str = "";
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			sum = a+b-c;
			str = String.valueOf(a)+String.valueOf(b);
			sum2 = Integer.parseInt(str) - c;
			
			
        System.out.println(sum);
		System.out.println(sum2);
	}
}