import java.util.Scanner;

// 1로 만들기 - DP
public class Ex_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // DP 테이블 (각 숫자를 1로 만드는 데 필요한 최소 연산 횟수)
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            // 1을 빼는 경우
            dp[i] = dp[i - 1] + 1;
            // 2로 나누어 떨어지는 경우
            if(i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            // 3으로 나누어 떨어지는 경우
            if(i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[n]);
    }
}
