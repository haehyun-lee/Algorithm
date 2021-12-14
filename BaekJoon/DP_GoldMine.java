import java.util.Scanner;

// 금광 문제
public class DP_GoldMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        // 테스트 케이스 별 진행
        for (int tc = 0; tc < testCase; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // 각 칸에 존재하는 금의 양 입력받기
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = sc.nextInt();
                }
            }

            // DP Bottom-Up
            for (int j = 1; j < m; j++) {
                for(int i = 0; i < n; i++){
                    int leftUp, leftDown, left;

                    // 왼쪽 위에서 오는 경우
                    if(i == 0) leftUp = 0;
                    else leftUp = dp[i - 1][j - 1];

                    // 왼쪽 아래에서 오는 경우
                    if(i == n - 1) leftDown = 0;
                    else leftDown = dp[i + 1][j - 1];

                    // 왼쪽에서 오는 경우
                    left = dp[i][j - 1];
                    // 해당 칸의 최적의 해 (얻을 수 있는 금의 최대 개수)
                    dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(left, leftDown));
                }
            }

            // 마지막 열의 칸 중 최대값 구하기
            int result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(result, dp[i][m - 1]);
            }

            // 얻을 수 있는 금의 최대 개수 저장
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}