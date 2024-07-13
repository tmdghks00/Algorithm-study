import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
// StringTokenizer를 사용하여 첫 번째 입력 줄을 공백으로 구분된 토큰들로 분리합니다.
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        // 두 개의 정수 집합 setA와 setB를 선언하고 초기화합니다.
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
// setA의 각 원소에 대해 setB에 포함되지 않은 원소의 개수를 셉니다.
// 이는 setA - setB의 크기를 구하는 과정입니다
        for(int num : setA) {
            if(!setB.contains(num)) {
                answer += 1;
            }
        }
// setB의 각 원소에 대해 setA에 포함되지 않은 원소의 개수를 셉니다. 
// 이는 setB - setA의 크기를 구하는 과정입니다.
        
        for(int num : setB) {
            if(!setA.contains(num)) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}