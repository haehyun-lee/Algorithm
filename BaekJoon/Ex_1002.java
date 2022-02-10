import java.util.Scanner;
import java.util.StringTokenizer;

// 터렛
public class Ex_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // A
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int d1 = sc.nextInt();
            // B
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int d2 = sc.nextInt();

            sb.append(targetPoint(x1, y1, d1, x2, y2, d2) + "\n");
        }
        System.out.println(sb);
    }

    public static int targetPoint(int x1, int y1, int d1, int x2, int y2, int d2) {

        int d3 = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // A-B 사이 거리의 제곱

        if (x1 == x2 && y1 == y2 && d1 == d2) {
            return -1;
        } else if (d3 > Math.pow(d1 + d2, 2)) {
            return 0;
        } else if (d3 < Math.pow(d2 - d1, 2)) {
            return 0;
        } else if (d3 == Math.pow(d2 - d1, 2)) {
            return 1;
        } else if (d3 == Math.pow(d1 + d2, 2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
