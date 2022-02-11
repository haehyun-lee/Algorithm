import java.util.Scanner;

// 팩토리얼 재귀
public class Ex_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) { return 1; }

        return n * factorial(n - 1);
    }
}