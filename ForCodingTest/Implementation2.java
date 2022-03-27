import java.util.Scanner;

/*
시각
00시 00분 00초 ~ N시 59분 59초 시간 중 3이 하나라도 포함되는 경우의 수
 */
public class Implementation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (String.format("%d%d%d", h, m, s).contains("3"))
                        count++;
                }
            }
        }

        System.out.println(count++);
    }
}
