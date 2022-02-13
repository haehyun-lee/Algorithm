import java.util.Scanner;

// 체스판 다시 칠하기
public class Ex_1018 {
    public static boolean[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // row
        int M = sc.nextInt();    // column

        board = new boolean[N][M];  // White : T, Black : F
        int min = Integer.MAX_VALUE;                // 최소 색칠 횟수

        // 전체 보드
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        // 시작 칸 위치에 따라 8x8 크기로 자르기
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                min = Math.min(paintChess(i, j), min);
            }
        }

        System.out.println(min);
    }

    public static int paintChess(int x, int y) {
        int count = 0;      // 색칠 횟수

        boolean color = board[x][y];    // 첫번째 칸 색깔 (기준)

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 그 칸에 맞는 색이 아닐 경우 색칠해야 함
                if (board[i][j] != color) {
                    count++;
                }

                // 다음 칸은 색상 반전
                color = !color;
            }

            // 다음 줄은 색상 반전
            color = !color;
        }

        /*
         * W로 시작하는 체스판, B로 시작하는 체스판 두 경우
         * (1) WB로 시작하는 체스판을 만들기 위해 색칠해야 하는 칸 수(그 위치에 맞지 않는 색인 칸)를 기준으로 했을 때
         * (2) BW로 시작하는 체스판을 만들기 위해서는 (1)에서 색칠했을 칸들은 그대로 두고, 이 칸들은 제외한
         * 나머지 칸들을 전부 반대 색상으로 칠해야 한다.
         * WB 체스판에서 W인 칸들은 BW 체스판에서 B이고,
         * WB 체스판에서 B인 칸들은 BW 체스판에서 W이기 때문이다.
         */
        count = Math.min(count, 64 - count);

        return count;
    }
}
