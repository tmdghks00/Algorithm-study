import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n개의 과목

		double sum = 0;
		double avg;
		
		int arr[] = new int[n]; 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();			
		}
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != 0) {
				sum += (arr[j]/ (double) max)*100;	
			}
		}
		
		avg = sum/n;
			System.out.print(avg);
			sc.close();
	}
}