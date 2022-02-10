import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int sum = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sum += n * n;
        }

        System.out.println(sum % 10);
    }
}
