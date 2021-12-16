import java.util.Arrays;
import java.util.Scanner;

// 쉬운 계단 수 : 인접한 모든 자리의 차이가 1인 수열
public class Ex_10844{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // DP 테이블 dp[길이][마지막숫자]
        long[][] dp = new long[101][11];

        // dp[1][마지막숫자] 값 초기화
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // DP Bottom-Up
        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }
        System.out.println(Arrays.toString(dp[n-1]));
        System.out.println(Arrays.toString(dp[n]));
        // 길이가 N인 계단 수의 총 개수 (마지막 합산은 마지막 숫자 0~9 모두)
        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[n][i];
        }
        System.out.println(sum % 1000000000);
    }
}