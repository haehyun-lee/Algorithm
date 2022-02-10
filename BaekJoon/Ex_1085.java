import java.util.Scanner;

// 직각사각형에서 탈출
public class Ex_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 세로 최단 거리, 가로 최단 거리 중 최솟값
        System.out.println(Math.min(Math.min(w - x, x), Math.min(h - y, y)));
    }
}
