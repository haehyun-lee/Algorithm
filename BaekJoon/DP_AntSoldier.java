import java.util.Scanner;
import java.util.StringTokenizer;

// 개미 전사 문제
public class DP_AntSoldier {
    // i번째 식량창고까지의 최적의 해 (얻을 수 있는 식량의 최대값)
    public static int[] dp = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 식량 창고 개수
        int n = sc.nextInt();

        // 식량 창고에 저장된 식량 개수
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
        }

        // 다이나믹 프로그래밍 진행 (Bottom-Up)
        dp[0] = count[0];
        dp[1] = Math.max(count[0], count[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + count[i]);
        }

        // 마지막 식량창고까지의 최적의 해 출력
        System.out.println(dp[n-1]);
    }
}