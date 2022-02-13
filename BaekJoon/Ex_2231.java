import java.util.Scanner;

// 분해합
public class Ex_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(getCreator(N));
    }

    static int getCreator(int n) {
        // 1~n 정수의 분해합 구하기
        for (int i = 1; i < n; i++) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // i의 분해합이 n일 경우, i가 n의 생성자
            if (sum + i == n) {
                return i;
            }
        }

        // 생성자가 없을 경우
        return 0;
    }
}
