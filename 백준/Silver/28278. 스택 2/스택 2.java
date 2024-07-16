import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] stack = new int[1000000];
    static int top = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "1" : push(Integer.parseInt(st.nextToken())); break;
                case "2" : pop(); break;
                case "3" : size(); break;
                case "4" : empty(); break;
                case "5" : peek(); break;
            }
        }
        System.out.print(sb.toString());
    }

    static void push(int n) {  // 요소 추가
        stack[top++] = n;
    }
    static void pop() { // 요소 제거(꺼내기)
        if(top > 0) sb.append(stack[--top]).append("\n");
        else sb.append(-1).append("\n");
    }
    static void size() { // 스택 크기 체크
        sb.append(top).append("\n");
    }
    static void empty(){ // 스택에 비어있는지 유무 확인
        if(top == 0) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }
    static void peek() { // 스택 최상단 요소 확인
        if(top == 0) sb.append(-1).append("\n");
        else sb.append(stack[top-1]).append("\n");
    }

}