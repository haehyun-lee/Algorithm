import java.util.Scanner;

// 바닥 공사 (타일링 문제 유형)
public class DP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        
        for (int i = 3; i <= n; i++) {
            // (i-1 경우에 2x1 덮개를 추가하는 경우) + (i-2 경우에 1x2, 2x2 덮개를 추가하는 경우)
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 795796;
        }

        System.out.println(dp[n]);
    }
}
