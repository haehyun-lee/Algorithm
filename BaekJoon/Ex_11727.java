import java.util.Scanner;

// 2 x n 타일링 (2)
public class Ex_11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
        }

        System.out.println(dp[n] % 10007);
    }
}
