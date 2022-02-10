import java.util.Scanner;

/**
 * 골드바흐의 추측 : 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다.
 * 골드바흐 수 : 위의 조건을 만족하는 수
 * 골드바흐 파티션 : 짝수를 두 소수의 합으로 나타내는 표현
 */
public class Ex_9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        // 소수 판별
        boolean[] prime = new boolean[10001];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length - 1); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j <= prime.length - 1; j += i) {
                prime[j] = true;
            }
        }

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int a = n / 2;
            int b = n / 2;

            // 차이가 가장 작은 절반 값(중심 값)부터 시작
            for (int i = 0; i < n / 2; i++) {
                if (prime[a - i] == false && prime[b + i] == false) {
                    sb.append((a - i) + " " + (b + i) + "\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
