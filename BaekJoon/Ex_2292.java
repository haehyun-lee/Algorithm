import java.util.Scanner;

// 벌집
public class Ex_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int layer = 1;
        int max = 1;

        while (true) {
            if (n <= max)
                break;

            max += (6 * layer);
            layer++;
        }

        System.out.println(layer);
    }
}
