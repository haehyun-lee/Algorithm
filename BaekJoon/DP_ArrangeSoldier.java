import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 병사 배치하기
public class DP_ArrangeSoldier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 병사의 전투력 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // DP 테이블 초기화
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        // DP Bottom-Up
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int maxVal =0;
        for(int val : dp){
            maxVal = Math.max(maxVal, val);
        }

        // 전체 - 최장 감소 부분 값 = 열외해야 하는 병사의 최소 수
        System.out.println(n - maxVal);
    }
}