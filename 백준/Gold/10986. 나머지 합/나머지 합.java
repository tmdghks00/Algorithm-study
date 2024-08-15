import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int M = Integer.parseInt(st.nextToken());   // 나누기 할 수
        long count = 0;                            // M으로 나누어떨어지는 (i,j) 쌍의 개수
        long[] S = new long[N + 1];                 // 합배열
        long[] cnt = new long[M];                   // 같은 나머지의 인덱스를 카운트하는 배열

        // N개의 수 입력받으면서 누적합을 M으로 나눈 나머지를 배열 S에 저장한다.
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            S[i] = (S[i - 1] + Integer.parseInt(st.nextToken())) % M;
            // 0~i까지의 합을 M으로 나눈 나머지가 0인 경우의 수 카운팅
            if(S[i] == 0) {
            	count++;
            }
            // 나머지가 같은 인덱스의 수 카운팅
            cnt[(int) S[i]]++;
        }

        // S[j] % M == S[i-1] % M 을 만족하는 (i,j)의 수를 결과값에 더한다.
        // 즉, cnt[i](i가 나머지인 인덱스의 수)에서 2가지를 뽑는 경우의 수 카운팅한다.
        for(int i = 0; i < M; i++) {
            if(cnt[i] > 1) {
            	count += (cnt[i]* (cnt[i]-1) / 2);
            }
        }
        System.out.println(count);
    }
}