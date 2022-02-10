import java.util.Scanner;

// 베르트랑 공준 : 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다
public class Ex_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int num = sc.nextInt();
        int count = 0;

        boolean[] prime = new boolean[123456 * 2 + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length-1); i++) {
            if (prime[i] == true) { continue; }

            for (int j = i * i; j <= prime.length-1; j += i) {
                prime[j] = true;
            }
        }

        while (num != 0) {
            count = 0;
            for (int i = num + 1; i <= 2 * num; i++) {
                if (prime[i] == false) {
                    count++;
                }
            }

            sb.append(count + "\n");

            num = sc.nextInt();
        }

        System.out.println(sb);
    }
}
