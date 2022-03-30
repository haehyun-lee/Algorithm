import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
미로 한 칸
x, y 좌표 값을 단위로 처리하기 위해 선언, 파이썬에서는 (x, y) 리스트로 대체 가능
 */
class Block {
    private int x;
    private int y;

    Block(int x, int y) {
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

// 미로 탐색
public class Ex_2178 {
    public static int[][] map;
    public static int N, M;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    // BFS, Queue, 반복문
    private static int bfs(int x, int y) {
        Queue<Block> q = new LinkedList<>();
        // 시작 위치
        q.offer(new Block(x, y));

        // 시작 위치에서 부터 한칸씩 상하좌우 체크, 이동할 수 있는 칸(1) 모두를 '해당 칸까지 오는데 필요한 칸 수'로 저장
        while (!q.isEmpty()) {
            Block block = q.poll();

            for (int i = 0; i < 4; i++) {
                // 상하좌우 이동 후 위치
                int nx = block.getX() + dx[i];
                int ny = block.getY() + dy[i];
                
                // 범위 벗어나면 무시
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                
                // 이동할 수 있는 칸 중 아직 방문하지 않은 곳
                if (map[nx][ny] == 1) {
                    map[nx][ny] = map[block.getX()][block.getY()] + 1;
                    q.offer(new Block(nx, ny));
                }
            }
        }

        return map[N - 1][M - 1];
    }
}
