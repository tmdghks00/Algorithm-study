import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int a = in.nextInt();
				arr1[i][j] = a;

			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int b = in.nextInt();
				arr2[i][j] = b;
				
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				
				System.out.print(arr1[i][j] + arr2[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		in.close();
		}

	}
