import java.util.Scanner;

// 설탕 배달
public class Ex_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 5를 기준으로 각 값을 하나씩 체크, 5의 나머지 : 0~4
        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else{
            switch (n % 5) {
                case 0:
                    System.out.println(n / 5);
                    break;
                case 1 : case 3:
                    System.out.println((n / 5) + 1);
                    break;
                case 2 : case 4:
                    System.out.println((n / 5) + 2);
                    break;
            }
        }
    }
}
