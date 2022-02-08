import java.util.Scanner;

// 손익분기점
public class Ex_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    // 고정비용
        int b = sc.nextInt();     // 가변비용
        int c = sc.nextInt();     // 판매가

        // 생산비가 판매가 보다 크거나 같으면 흑자 없음
        if (b >= c) {
            System.out.println(-1);
        }else {
            // 순이익(판매가-가변비용)이 고정비용을 넘는 순간이 손익분기점
            System.out.println(a / (c - b) + 1);
        }
    }
}
