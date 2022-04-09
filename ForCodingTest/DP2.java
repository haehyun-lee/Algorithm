import java.util.Scanner;

// 1로 만들기
public class DP2 {
    public static int[] dp = new int[30001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 1로 만들어야 하는 수

        // 다이나믹 프로그래밍 Bottom-Up 방식
        for (int x = 2; x <= n; x++) {
            // 현재 수에서 1을 빼는 경우 (x-1 값을 1로 만드는 최소 연산 횟수 + 1빼기 연산 한번)
            dp[x] = dp[x - 1] + 1;

            // 현재 수가 2, 3, 5로 나누어 떨어지면 나누는 경우 (1빼기 연산과 2, 3, 5 나누기 연산 중 최솟값으로 갱신)
            if (x % 2 == 0) {
                dp[x] = Math.min(dp[x], dp[x / 2] + 1);
            }
            if (x % 3 == 0) {
                dp[x] = Math.min(dp[x], dp[x / 3] + 1);
            }
            if (x % 5 == 0) {
                dp[x] = Math.min(dp[x], dp[x / 5] + 1);
            }
        }

        // n을 1로 만들기 위한 최소 연산 횟수
        System.out.println(dp[n]);
    }
}
