import java.util.Scanner;

public class Ex_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int result = 0;     // 각 자리 수를 더한 값
        int prev = n;       // 만들어진 새로운 수

        do{
            // 1. 각 자리 수 더하기
            result = (prev / 10) + (prev % 10);
            // 2. 새로운 수 만들기
            prev = Integer.parseInt(prev % 10 + "" + result % 10);
            count++;
        } while (n != prev);

        System.out.print(count);
    }
}
