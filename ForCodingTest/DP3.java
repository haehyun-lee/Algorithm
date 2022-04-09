import java.util.Scanner;

// 개미 전사
public class DP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] dp = new int[100];

        // DP Bottom-Up
        dp[0] = array[0];
        dp[1] = Math.max(array[0], array[1]);
        for (int i = 2; i < n; i++) {
            // i-2, i번째 식량창고를 털 경우 vs i-1 번째 식량창고를 털 경우 
            dp[i] = Math.max(dp[i - 2] + array[i], dp[i - 1]);
        }

        System.out.println(dp[n - 1]);
    }
}
