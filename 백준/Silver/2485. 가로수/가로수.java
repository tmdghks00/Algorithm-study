import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N]; //가로수의 개수 입력 받음
        int minDivisor = 0;
        int sum = 0;
        
        for(int i = 0; i < N; ++i) {
        	arr[i] = Integer.parseInt(br.readLine()); //가로수의 위치를 입력받음
        }
        
        for(int i = 1; i < N; ++i) 
        { 
        	int dis = arr[i] - arr[i-1]; //가로수의 거리 차이
        	minDivisor = gcd(dis, minDivisor); 
        	// 두 가로수의 최대공약수를 저장
        }
        
        for(int i = 1; i < N; ++i) {
        	sum += ((arr[i] - arr[i-1]) / minDivisor) -1; 
        	//'(두 가로수의 거리 / 최대공약수) -1' 를 더함
        }
        	System.out.println(sum);
    }
    
    static int gcd(int a, int b) //유클리드 호제법
    {
    	if(b==0) return a;
    	else return gcd(b,a%b);
    }
}