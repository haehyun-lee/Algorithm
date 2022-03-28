public class Factorial {
    // 반복적으로 구현
    public static int factorialIterative(int n) {
        int result = 1;
        // 1부터 n까지의 수를 차례로 곱하기
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 재귀적으로 구현
    public static int factorialRecursive(int n) {
        // 종료 조건 : 1! = 1
        if (n <= 1) return 1;
        // 점화식 : n! = (n-1)! * n
        return factorialRecursive(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println("반복적으로 구현 : " + factorialIterative(5));
        System.out.println("재귀적으로 구현 : " + factorialRecursive(5));
    }
}
