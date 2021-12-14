import java.util.HashSet;
import java.util.Scanner;

// 1, 2, 3 더하기
public class Ex_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        for (int tc = 0; tc < testCase; tc++) {
            int n = sc.nextInt();

            int[] dp = new int[n + 3];  // n이 1일 경우 대비
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
            }

            sb.append(dp[n] + "\n");
        }

        System.out.println(sb);
    }
}
