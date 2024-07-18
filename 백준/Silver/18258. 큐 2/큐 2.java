import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<N; i++) {
            String[] command = bf.readLine().split(" ");
            switch (command[0]) {
                case "push": // 정수 X를 큐에 넣는 연산
                    queue.add(Integer.parseInt(command[1]));
                    break;
                case "pop": // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        int temp = queue.get(0);
                        queue.remove(queue.get(0));
                        sb.append(temp).append("\n");
                    }
                    break;
                case "size": // 큐에 들어있는 정수의 개수를 출력
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty": // 큐가 비어있으면 1, 아니면 0을 출력
                    if (queue.size() == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front": // : 큐의 가장 앞에 있는 정수를 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(0)).append("\n");
                    }
                    break;
                case "back": //  큐의 가장 뒤에 있는 정수를 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(queue.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}