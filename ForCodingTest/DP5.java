import java.util.Arrays;
import java.util.Scanner;

// 효율적인 화폐 구성
public class DP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        // 금액을 만들기 위한 최소한의 화폐 개수
        int[] dp = new int[10001];

        // 주어진 화폐로 해당금액을 만들 수 없음으로 일단 초기화
        Arrays.fill(dp, 10001);

        // (금액 - 현재 화폐) 값을 만들기 위한 최소한의 화폐 개수 + 현재 화폐 1개
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= m; i++) {
                // 다른 화폐 경우의 수로 구성했을 때가 최소일 경우를 대비해 min 값을 저장
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // 불가능 한 경우 -1 출력
        int result = (dp[m] == 10001) ? -1 : dp[m];
        System.out.println(result);
    }
}
