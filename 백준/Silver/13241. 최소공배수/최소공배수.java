import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            long A = scanner.nextLong();
            long B = scanner.nextLong();
            
            long lcm = A * B / gcd(A, B); // 최소공배수 계산
            System.out.println(lcm);
        
    }
    
    // 최대공약수를 구하는 메소드
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
