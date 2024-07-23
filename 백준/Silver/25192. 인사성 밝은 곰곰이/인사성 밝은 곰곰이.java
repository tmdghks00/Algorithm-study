import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        HashSet<String> set = new HashSet<>();
        //  String의 중복여부를 확인하기 위한 HashSet
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                set.clear(); // ENTER 가 나오면 HashSet 초기화
            } else {
                if (set.contains(s)) continue;
                set.add(s); // set에 s가 없으면 s를 추가하고 횟수 증가시킴
               cnt++;
            }
        }
        System.out.println(cnt);
    }
}
// 