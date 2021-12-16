import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 스티커
public class Ex_9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] score = new int[2][n + 1];

            // 스티커 점수 초기화
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= n; j++) {
                    score[i][j] = sc.nextInt();
                }
            }

            // score[row][col] = 해당 스티커가 마지막일 때 최대 점수
            for (int i = 2; i <= n; i++) {
                score[0][i] += Math.max(score[1][i - 1], score[1][i - 2]);
                score[1][i] += Math.max(score[0][i - 1], score[0][i - 2]);
            }

            int maxScore = 0;
            for (int[] arr : score)
                for(int i : arr)
                    maxScore = Math.max(maxScore, i);

            // 최대 점수 출력
            System.out.println(maxScore);
        }
    }
}
