import java.util.Scanner;

// 곱셈 과정 출력
public class Ex_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = b;
        for(int i = 0; i < 3; i++){
            System.out.println(a * (tmp % 10));
            tmp = tmp / 10;
        }

        System.out.println(a * b);
    }
}
