import java.util.Scanner;

public class Ex_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        boolean[] prime = new boolean[N + 1];   // 소수 여부. false : 소수, true : 소수아님

        // 0, 1 소수 아님
        prime[0] = true;
        prime[1] = true;

        // 2 ~ N 소수 판별
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // 앞의 i 에서 이미 걸려진 배수일 경우 다음으로 (ex: 4의 배수는 2의 배수에서 다 걸러짐)
            if (prime[i] == true) {
                continue;
            }

            // 앞의 i 에서 이미 걸려진 배수들 넘기고 시작 (ex: 4x2는 i=2에서, 4x3은 i=3에서 걸러짐)
            for (int j = i * i; j <= N; j += i) {
                prime[j] = true;
            }
        }

        // 소수 출력
        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}
