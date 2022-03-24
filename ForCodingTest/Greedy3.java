import java.util.Scanner;

// 숫자 카드 게임
public class Greedy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // 현재 행의 최솟값
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min = Math.min(min, x);
            }
            // 각 행의 최솟값 중 최대값
            result = Math.max(result, min);
        }

        System.out.println(result);
    }
}
