import java.util.Scanner;
import java.util.StringTokenizer;

// 유기농 배추
public class Ex_1012 {
    public static int M, N, K;
    public static int[][] field;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            M = sc.nextInt();   // 가로길이
            N = sc.nextInt();   // 세로길이
            K = sc.nextInt();   // 배추가 심어져 있는 위치의 개수
            int count = 0;
            sc.nextLine();

            field = new int[N][M];

            // 배추 위치 입력받기
            for (int i = 0; i < K; i++) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                field[Y][X] = 1;
            }

            // 각 위치에서 연결 체크
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (dfs(i, j))
                        count++;
                }
            }

            sb.append(count + "\n");
        }
        System.out.print(sb);
    }

    private static boolean dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= N || j >= M) {
            return false;
        }

        if (field[i][j] == 1) {
            field[i][j] = 0;
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i, j + 1);

            return true;
        }

        return false;
    }
}
