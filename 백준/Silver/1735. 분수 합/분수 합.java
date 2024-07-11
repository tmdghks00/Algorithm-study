import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int c1, c2, p1, p2;
		
		//c1/p1, c2/p2
		c1= sc.nextInt();
		p1= sc.nextInt();
		c2= sc.nextInt();
		p2= sc.nextInt();
        
        //더해주고
		c1=c1*p2+c2*p1;
		p1=p1*p2;
		int gcd= getgcd(c1, p1); //최대공약수를 구해준다.
		System.out.println(c1/gcd+" "+p1/gcd); //기약분수 출력
    }  
    
    // 최대공약수를 구하는 메소드
    public static int getgcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getgcd(b, a % b);
    }
}
