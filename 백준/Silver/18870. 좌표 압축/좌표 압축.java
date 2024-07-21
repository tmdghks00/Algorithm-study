import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int[] nums = new int[N];        
        for (int i = 0; i < N; i++) {
        	nums[i] = Integer.parseInt(st.nextToken()); 
        }
        
        int[] ori = nums.clone();
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> x = new HashMap<>(); // 중복된 값을 처리
        for (int i = 0; i< N; i++) {
        	if (!x.containsKey(nums[i])) {
        		x.put(nums[i], cnt++);
        	}
        }
        for (int i = 0; i < N; i++) {
        	sb.append(x.get(ori[i])).append(" ");
//get 함수는 HashMap에서 원본 배열의 각 값에 대한 순위를 찾아 반환하는 역할
        }
        System.out.println(sb);
    }
}
