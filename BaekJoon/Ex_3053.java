import java.util.Scanner;

public class Ex_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();                       // 반지름 : 두 점 사이의 거리

        System.out.printf("%f\n", Math.PI * r * r); // 유클리드 기하학
        System.out.printf("%f", 2.0 * r * r);       // 택시 기하학
    }
}
