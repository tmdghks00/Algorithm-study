import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine(); // 수 입력
            boolean check = true;
            
            if (str.equals("0")) break; // 0이 입력되면 종료
            
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) check = false;
            }
            
            if (check) System.out.println("yes"); // 팰린드롬수인 경우
            else System.out.println("no"); // 팰린드롬수가 아닌 경우
        }
    }
}