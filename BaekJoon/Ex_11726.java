import java.util.Scanner;

// 2 x n 타일링
public class Ex_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;    // 다음 연산 값을 제대로 계산하기 위해 매번 10007 나머지 계산 수행
        }

        System.out.println(dp[n] % 10007);
    }
}