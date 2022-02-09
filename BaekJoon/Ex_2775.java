import java.util.Scanner;

// 부녀회장이 될테야
public class Ex_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();
        int[] floor = new int[15];     // 한 층의 거주자 수

        for (int t = 0; t < T; t++) {
            // 0층 각 호 거주자 수 초기화
            for (int i = 0; i < floor.length; i++) {
                floor[i] = i;
            }
            
            int k = sc.nextInt();
            int n = sc.nextInt();

            // 1층 ~ k층
            for (int i = 1; i <= k; i++) {
                // 1호 ~ n호
                for (int j = 1; j <= n; j++) {
                    floor[j] += floor[j - 1];
                }
            }

            sb.append(floor[n] + "\n");
        }

        System.out.print(sb);
    }
}
