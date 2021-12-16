import java.util.Arrays;
import java.util.Scanner;

// 오르막 수
public class Ex_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // dp[N][L] = 수의 길이가 N일 때, 마지막 수가 L인 오르막 수 개수
        long[][] dp = new long[1001][10];

        // dp[1] 배열 초기화
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // DP BottomUp
        for (int i = 2; i <= n; i++) {
            dp[i][0] = 1;       // 마지막 수가 0인 오름수가 될 수 있는 건 0000..밖에 없음
            for (int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 10007;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum % 10007);
    }
}