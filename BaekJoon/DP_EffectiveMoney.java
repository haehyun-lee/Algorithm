import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 효율적인 화폐 구성
public class DP_EffectiveMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // N개의 화폐 단위 정보 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // DP 테이블 초기화 (일단 모두 불가능한 것으로)
        int[] d = new int[m + 1];
        Arrays.fill(d, 1001);

        // 다이나믹 프로그래밍 Bottom-Up (각 화폐단위 별로 모든 금액 계산)
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                // (j - 화폐단위)원을 만드는 방법이 존재하는 경우
                if (d[j - arr[i]] != 1001) {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);   // 기존 값과 방금 계산한 값 중 최소값
                }
            }
        }
        
        // 불가능한 경우만 -1 출력
        if(d[m] == 1001) System.out.println(-1);
        else System.out.println(d[m]);
    }
}
