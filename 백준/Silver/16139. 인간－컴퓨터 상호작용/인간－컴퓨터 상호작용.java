import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

/* 행은 문자열의 각 위치 + 1을 나타내고, 열은 각 알파벳 문자
	('a'부터 'z'까지 26개)를 나타냄
 	A[i][j]는 문자열의 시작부터 i번째 위치까지 문자 
	'j' ('a' = 0, 'b' = 1, ..., 'z' = 25)의 출현 횟수를 저장함
*/
        int[][] A = new int[s.length()+1][26];

        for(int i = 1; i < s.length()+1; i++){ // 2차원 배열 A를 채움
                    	
            int value = s.charAt(i-1) - 'a';// 현재 문자열에서의 문자의 알파벳 인덱스를 구함
            
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = A[i-1][j] + (value == j ? 1 : 0);
            } // // 이전 행의 카운트를 복사하고, 현재 문자의 카운트를 업데이트함
        }

        int N = Integer.parseInt(br.readLine()); //질문(쿼리)의 개수를 입력받음
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 각 질문을 처리함
        for(int i = 0; i < N; i++){
        	// 입력된 질문을 알파벳 문자와 l, r 인덱스로 나눔
            st = new StringTokenizer(br.readLine() , " ");
            
            // 주어진 문자의 알파벳 인덱스를 구함
            int index = st.nextToken().charAt(0) - 'a';
            
            // l과 r 인덱스를 입력받음
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            // 인덱스 l과 r 사이에 해당 문자가 몇 번 나타났는지를 계산함
            // r+1 위치의 값에서 l 위치의 값을 뺌으로써 구할 수 있음
            sb.append(A[r+1][index] - A[l][index]).append("\n");
        }
        System.out.println(sb); //  // 모든 결과를 한 번에 출력함

    }
}