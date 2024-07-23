import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");
        StringTokenizer st;
        
        for (int i = 0; i < n; i++) {
        	 st = new StringTokenizer(br.readLine());
        	 String s1 = st.nextToken();
             String s2 = st.nextToken();
           // 댄스를 추고있던 있는 사람을 만나면 댄스를 추게 되므로 set에 추가함
             if (set.contains(s1) || set.contains(s2)) {
                 set.add(s1);
                 set.add(s2);
             }
         }
         System.out.println(set.size());
     }



 }
  