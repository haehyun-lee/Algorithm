import java.util.Scanner;

public class Ex_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MIN_VALUE;

        // m ~ n 수들에 대해
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (min == Integer.MIN_VALUE) {
                    min = i;
                }
                sum += i;
            }
        }

        System.out.println(sum == 0 ? "-1" : sum + "\n" + min);
    }


    static boolean isPrime(int n) {
        if(n == 1) { return false; }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
