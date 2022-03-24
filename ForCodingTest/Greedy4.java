import java.util.Scanner;

// 1이 될 때까지
public class Greedy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지 1씩 빼기
            int target = (n / k) * k;   // K로 나누어 떨어지는 가장 큰 수
            result += n - target;       // target 수가 되기 위해 -1 해야 하는 횟수
            n = target;                 // -1 빼기 결과

            // N이 K보다 작을 때(더 이상 나눌 수 없을 때) 탈출
            if(n < k)
                break;

            // K로 나누기
            result++;
            n /= k;
        }

        // 마지막으로 남은 수(k 보다 작아서 나누어 떨어지지 않는 수)에 대하여 1씩 빼기
        result += (n - 1); 
        System.out.println(result);

        /*
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

         */
    }
}
