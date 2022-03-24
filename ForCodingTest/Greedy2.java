import java.util.Arrays;
import java.util.Scanner;

// 큰 수의 법칙
public class Greedy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 배열 크기
        int m = sc.nextInt();   // 더해지는 횟수
        int k = sc.nextInt();   // 연속 가능 횟수
        int result = 0;         // 연산 결과

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(numbers);
        int first = numbers[n - 1];     // 가장 큰 수
        int second = numbers[n - 2];    // 두 번째로 큰 수

        result += (first * k + second) * (m / (k + 1)); // 가장 큰 수 + 두 번째로 큰 수 수열 반복
        result += first * (m % (k + 1));                // 나머지 수는 무조건 가장 큰 수

        System.out.println(result);

        /*
        for (int i = 1, j = 1; i <= m; i++, j++) {
            if (j > k) {
                result += numbers[numbers.length - 2];
                j = 1;
            } else {
                result += numbers[numbers.length - 1];
            }
        }
        */
    }
}
