import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
토마토
1 : 익은 토마토, 0 : 익지 않은 토마토, -1 : 토마토가 들어있지 않은 칸
익은 토마토가 상하좌우 네 방향에 있는 토마토를 익게 만들 때, 창고에 모든 토마토가 익기까지 며칠이 걸리는가
2차원 배열의 값이 모두 1이 되기까지 몇번의 '네 방향 익히기' 해야하는가
BFS 사용해서 전부 1되도록 하고 마지막에 0이 존재하면 -1 출력?
 */

class Box {
    private int x;
    private int y;

    Box(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Ex_7576 {
    public static int N, M;
    public static int[][] warehouse;
    public static Queue<Box> q = new LinkedList<>();
    public static int notTomato = 0;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();
        warehouse = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            for (int j = 0; j < M; j++) {
                warehouse[i][j] = Integer.parseInt(st.nextToken());
                if (warehouse[i][j] == 1) {
                    q.offer(new Box(i, j));
                } else if (warehouse[i][j] == -1) {
                    notTomato++;
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        int day = 0;

        // 모든 토마토가 익어있는 상태
        if (q.size() == (N * M - notTomato)) {
            return 0;
        }

        // 날짜별로 익은 토마토의 네 방향 토마토들 익히기
        while (!q.isEmpty()) {
            day++;
            int ripeTomato = q.size();
            for (int i = 0; i < ripeTomato; i++) {
                Box box = q.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = box.getX() + dx[j];
                    int ny = box.getY() + dy[j];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                        continue;
                    }

                    if (warehouse[nx][ny] == 0) {
                        warehouse[nx][ny] = 1;
                        q.offer(new Box(nx, ny));
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 토마토가 모두 익지는 못하는 상황
                if (warehouse[i][j] == 0)
                    return -1;
            }
        }

        // 마지막 외곽 토마토가 익히는 행동은 제외
        return day - 1;
    }
}
