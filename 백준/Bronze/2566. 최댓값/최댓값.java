import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int idx1 = 0;
		int idx2 = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int up = in.nextInt();
				arr[i][j] = up;
				if(max < arr[i][j]) {
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		idx1 += 1;
		idx2 += 1;
		System.out.println(max);
		System.out.println(idx1+" "+idx2);
		in.close();
	}
}