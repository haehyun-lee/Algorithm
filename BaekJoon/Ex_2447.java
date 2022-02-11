import java.util.Scanner;

// 별 찍기 - 10
public class Ex_2447 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr = new char[N][N];

        star(0, 0, N, false);

        StringBuffer sb = new StringBuffer();
        // 2차원 배열 요소를 하나의 문자열로 추가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void star(int x, int y, int N, boolean blank) {
        // 종료조건1 : 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        
        // 종료조건2 : 더 이상 쪼갤 수 없는 블록일 때 (n = 3 의 구성요소 한 칸)
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        // 별 찍기 재귀
        int size = N / 3;   // 해당 블록의 구성요소 한 칸 크기
        int count = 0;      // 별 출력 순서 (공백칸 구분용)

        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
