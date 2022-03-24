import java.util.Scanner;

// 1이 될 때까지
public class Greedy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        // n이 k 이상이라면 k로 계속 나누기
        while (n >= k) {
            // n이 k로 나누어 떨어지지 않는다면 n에서 1씩 빼기
            while (n % k != 0) {
                n -= 1;
                result++;
            }
            // k로 나누기
            n /= k;
            result++;
        }

        // 마지막 남은 k보다 작은 수에 대하여 1씩 빼기
        while (n > 1) {
            n -= 1;
            result++;
        }

        System.out.println(result);
    }
}
