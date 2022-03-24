import java.util.Scanner;

// 거스름돈
public class Greedy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for (int coin : coinTypes) {
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
