import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

        int count = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (isPrime(n))
                count++;
        }

        System.out.println(count);
    }

    static boolean isPrime(int n) {
        if(n == 1) { return false; }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
