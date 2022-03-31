import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
토마토 3D
3차원 배열, BFS, Queue
7576 토마토 코드와 달리, static 변수 없애고 함수에 매개변수로 값 넘기는 방식으로 변경
 */

class Tomato {
    int z;  // 층
    int x;  // 행
    int y;  // 열

    Tomato(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }
}

public class Ex_7569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();
        sc.nextLine();
        
        int[][][] tomatoes = new int[H][N][M];
        Queue<Tomato> q = new LinkedList<>();     // 전날에 익은 토마토들
        int unripeTomato = 0;                     // 덜 익은 토마토 개수

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                for (int m = 0; m < M; m++) {
                    tomatoes[h][n][m] = Integer.parseInt(st.nextToken());
                    // 익어있는 토마토 저장
                    if (tomatoes[h][n][m] == 1)
                        q.offer(new Tomato(h, n, m));
                    else if(tomatoes[h][n][m] == 0)
                        unripeTomato++;
                }
            }
        }

        int result = ripeTomatoBfs(tomatoes, unripeTomato, q);
        System.out.println(result);
    }

    private static int ripeTomatoBfs(int[][][] tomatoes, int unripeTomato, Queue<Tomato> q) {

        int day = 0;        // 며칠이 걸리는지 - BFS Depth Check
        int ripeTomato = 0; // 주변에 의해 익은 토마토 수

        // 상자 크기
        int H = tomatoes.length;
        int N = tomatoes[0].length;
        int M = tomatoes[0][0].length;

        // 6방향(위, 아래, 앞, 뒤, 왼쪽, 오른쪽) 이동 좌표
        int[] dz = {-1, 1, 0, 0, 0, 0};
        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {0, 0, 0, 0, -1, 1};

        // 토마토가 이미 다 익어있는 경우
        if (unripeTomato == 0) {
            return 0;
        }

        // 토마토 날짜별로 익히기 - BFS 수행
        while (!q.isEmpty()) {
            // 덜 익은 토마토를 다 익힘
            if (ripeTomato == unripeTomato) {
                return day;
            }

            int size = q.size();    // 전날에 익은 토마토 개수

            // 오늘은 전날에 익은 토마토의 주변 토마토만 익히기
            for (int i = 0; i < size; i++) {
                Tomato tomato = q.poll();

                // 위, 아래, 앞, 뒤, 왼쪽, 오른쪽
               for (int j = 0; j < 6; j++) {
                   int nz = tomato.z + dz[j];
                   int nx = tomato.x + dx[j];
                   int ny = tomato.y + dy[j];

                   // 박스 범위 벗어난 이동은 무시
                   if (nz < 0 || nx < 0 || ny < 0 || nz >= H || nx >= N || ny >= M) {
                       continue;
                   }

                   // 해당 방향의 토마토가 아직 안익은 토마토일 경우
                   if (tomatoes[nz][nx][ny] == 0) {
                       // 토마토 익히고, 내일 주변 토마토를 익힐 기준 토마토로 추가
                       tomatoes[nz][nx][ny] = 1;
                       q.offer(new Tomato(nz, nx, ny));
                       ripeTomato++;
                   }
                }
            }

            day++;  // 하루 지남
        }

        // 토마토가 모두 익지는 못할 경우
        return -1;
    }
}
