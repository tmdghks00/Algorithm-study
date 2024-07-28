import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	static int[][] arr = new int[9][9];
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 9 ; i++) {
		StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j = 0 ; str.hasMoreTokens();j++) {
			arr[i][j]= Integer.parseInt(str.nextToken());
			}
		}

		sudoku(0,0); // 행과 열을 0,0 부터 시작
 // 행은 0~8 열도 0~8 로 구성됨
	}
 
	public static void sudoku(int row, int col) { // 행과 열
		
		if(col == 9) { // 열이 9라면 끝까지 찾았으므로 다음 행으로 이동함
			sudoku(row+1,0);
			return;
		}
		
		if(row == 9) { // 행이 9라면 모든 스도쿠를 채운것임
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb); // 스도쿠 출력
			
			System.exit(0); // 프로그램 종료
		}
		
// 만약 해당 위치의 값이 0 이라면 1부터 9까지 중 가능한 수 탐색		
		if(arr[row][col]==0) {
			for(int i = 1 ; i <= 9 ; i++) {
				if(check(row, col, i)) { // i값이 중복되지 않는지 검사
// 만약 이전에 만들었던 CHECK에 TRUE가 들어온다면, 그 값을 넣어도 된다는 뜻임					
					arr[row][col] = i;
					sudoku(row, col+1); 
// 열을 하나 올려서 다른빈칸을 찾으러 재귀를 호출
				}
			}
			arr[row][col]=0; // 스도쿠 문제가 잘못됨
			return; // DFS 종료시킴
		}
		
		sudoku(row, col+1); //빈칸이 아닌경우 열을 1칸 이동
	}
 
	public static boolean check(int row, int col, int value) {
		
		//같은행에 무슨 숫자가 비었는지
		for(int i = 0 ; i < 9 ; i ++) {
			if(arr[row][i] == value) {
				return false; // 해당값이 있으면 false
// false 라면 인자로 들어온 i (value) 값은 들어가면 안 된다고 알려줌				
			}
		}
		
		//같은열에 무슨 숫자가 비었는지
		for(int i = 0 ; i < 9 ; i ++) {
			if(arr[i][col] == value) {
				return false; // 해당값이 있으면 false
// false 라면 인자로 들어온 i (value) 값은 들어가면 안 된다고 알려줌				
			}
		}
		
		//같은 네모에 뭐가 있는지, 같은 네모 박스에 같은 값이 있는가
		int ind_row = (row/3)*3;
		int ind_col = (col/3)*3;
		
// 0,1,2 번 행이 들어오면 0번부터 찾고 3,4,5 번 행이 들어오면 1번부터 찾음		
		for(int i = ind_row ; i < ind_row+3 ; i ++) {
			for(int j = ind_col ; j < ind_col +3 ; j++) {
				if(arr[i][j] == value)
					return false; // 해당값이 있으면 false				
			}
		}
		
		return true; // 중복되는 것이 없을 경우 true 반환
	}
	

}