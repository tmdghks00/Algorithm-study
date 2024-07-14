import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

public class Main {

   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      Set<String> set = new HashSet<>();
// set = 순서x , 중복 허용x
      for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j <= str.length(); j++) {
            set.add(str.substring(i, j));
         }
      }
//이중 for문을 사용하여 구할 수 있는 모든 부분 문자열을 구하고 각 부분 문자열을 Set에 저장
      System.out.println(set.size());
      
   }
}