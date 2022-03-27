import java.util.Scanner;
import java.util.StringTokenizer;

// 상하좌우 - 시뮬레이션 유형
public class Implementation1_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int x = 1, y = 1;
        String[] plans = sc.nextLine().split(" ");

        // L, R, U, D에 따른 이동 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] moveTypes = {"L", "R", "U", "D"};

        // 이동 계획을 하나씩 확인
        for (String plan : plans) {
            int nx =0, ny = 0;
            // 이동 후 좌표 구하기
            for (int i = 0; i < moveTypes.length; i++) {
                if (plan.equals(moveTypes[i])) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }

            // 이동 수행
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
