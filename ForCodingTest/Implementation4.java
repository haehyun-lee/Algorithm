import java.util.Scanner;
import java.util.StringTokenizer;

/*
게임 개발
방향을 설정해서 이동하는 문제 유형은 dx, dy로 좌표 이동 배열 이용해서 이동하기 (복잡한 switch문 대체 가능)
 */
public class Implementation4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 행
        int m = sc.nextInt();   // 열

        // 현재 위치, 방향 - 북(0), 동(1), 남(2), 서(3)
        int x = sc.nextInt();
        int y = sc.nextInt();
        int direction = sc.nextInt();

        // 육지(0), 바다(1), 방문 육지(2)
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                map[i][j] = sc.nextInt();

        // 현재 위치 방문 처리
        map[x][y] = 2;

        // 북, 동, 남, 서 방향 정의
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int count = 1;
        int turnLeft = 0;         // 4 방향 체크 여부

        while (true) {
            // 1. 왼쪽 회전
            direction = (direction - 1 < 0) ? 3 : direction - 1;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            
            if (map[nx][ny] == 0) {
                // 2-1. 회전한 이후 정면에 가본지 않은 칸이 존재하는 경우
                x = nx;
                y = ny;
                count++;
                turnLeft = 0;
                map[x][y] = 2;
                continue;
            } else {
                // 2-2. 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
                turnLeft++;
            }

            // 3. 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 경우
            if (turnLeft == 4) {
                // 뒤로 한칸 후진
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (map[nx][ny] != 1) {
                    // 육지
                    x = nx;
                    y = ny;
                    turnLeft = 0;
                    map[x][y] = 2;
                } else {
                    // 바다
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
