import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()); // int는 불가


        System.out.println( n*(n-1)/2);    // (n-1) + (n-2) +...+ 1번 이므로 등차수열!
        System.out.println(2);    // O(n^2)의 시간복잡도이므로 최고차항은 2차

    }
}