import java.util.Scanner;

public class Ex_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuffer sb = new StringBuffer();

        // n의 제곱근 이하 소수만 탐색
        for (int i = 2; i * i <= n; i++) {
            // 해당 i 값으로 딱 나누어 떨어질 경우 계속 나누기
            while (n % i == 0) {
                sb.append(i + "\n");
                n /= i;
            }
        }

        // 마지막으로 나온 몫이 n의 제곱근 이상 소수일 경우 (마지막 몫이 1이 아닌 경우)
        if (n != 1) {
            sb.append(n + "\n");
        }

        System.out.print(sb);
    }
}
