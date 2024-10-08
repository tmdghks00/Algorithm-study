import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightedSum = 0; // 가중치 합 (학점 * 과목평점)
        double totalCredits = 0; // 총 학점

        for (int i = 0; i < 20; i++) {
            String s = sc.nextLine();
            String[] input = s.split(" ");
            double credit = Double.parseDouble(input[1]);

            // 과목 평점 계산 (P는 제외)
            double gradePoint = 0;
            switch (input[2]) {
                case "A+": gradePoint = 4.5; break;
                case "A0": gradePoint = 4.0; break;
                case "B+": gradePoint = 3.5; break;
                case "B0": gradePoint = 3.0; break;
                case "C+": gradePoint = 2.5; break;
                case "C0": gradePoint = 2.0; break;
                case "D+": gradePoint = 1.5; break;
                case "D0": gradePoint = 1.0; break;
                case "F": gradePoint = 0.0; break; // F는 0점 처리
                case "P": continue; // P는 제외
            }

            weightedSum += credit * gradePoint;
            totalCredits += credit; 
        }

        double gpa = (totalCredits > 0) ? weightedSum / totalCredits : 0.0;
        System.out.printf("%.6f", gpa); // 소수점 6자리까지 출력 (오차 범위 만족)
        sc.close();
    }
}