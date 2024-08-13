import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in); // 사용자가 입력을 받을 Scanner 객체 생성
        
        int N = sc.nextInt(); // 온도를 측정한 전체 날짜의 수를 입력받아 N에 저장
        int K = sc.nextInt(); // 합을 구하기 위한 연속적인 날짜의 수를 입력받아 K에 저장
        int[] arr = new int[N]; // N일 간의 온도를 저장할 배열 arr 생성

        arr[0] = sc.nextInt(); // 첫째 날의 온도를 배열 arr의 첫 번째 원소에 저장
        for(int i = 1; i<N; i++){ // 둘째 날부터 N일까지의 온도를 처리하는 반복문
            arr[i] = arr[i-1] + sc.nextInt(); 
            // 현재 날의 온도 + 이전 날까지의 온도 합을 현재 인덱스에 저장하여 누적 합 배열을 만듦
        }

        int max = arr[K-1]; // 초기 최대값을 첫 K일 간의 온도의 합으로 설정
        for(int i = K; i<N; i++){ 
            // K일 이후부터 N일까지의 모든 구간에서 K일간의 온도의 합을 구하는 반복문
            max = Math.max(arr[i] - arr[i - K], max); 
            // 현재 구간의 K일간 온도의 합과 이전까지의 최대값을 비교하여 더 큰 값을 max에 저장
        }

        System.out.println(max); // 최종적으로 K일간 온도의 합 중 가장 큰 값을 출력
    }
}
