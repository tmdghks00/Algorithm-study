import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {
    		Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		int d = sc.nextInt();
    		int e = sc.nextInt();
    		double result = Math.pow(a, 2) + Math.pow(b, 2) +Math.pow(c, 2) + Math.pow(d, 2) +Math.pow(e, 2);
    		double sum = result%10;
    		int sum2 = (int)sum;
    		
        System.out.println(sum2);
    }
}