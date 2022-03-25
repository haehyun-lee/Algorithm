import java.util.Scanner;

/*
동전 0
동전 개수를 최소로 해서 정해진 K값을 만들려면
단위가 큰 동전을 우선적으로 많이 사용해야 한다.
i >= 2인 경우 coin[i]는 coin[i-1]의 배수 => Greedy
 */
public class Ex_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            result += (k / coin[i]);
            k %= coin[i];
        }

        System.out.println(result);
    }
}
