import java.util.Scanner;

// 영화감독 숌
public class Ex_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int seq = 0;

        for (int i = 666; ; i++) {
            if (String.valueOf(i).contains("666")) {
                seq++;
                if (seq == N) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
