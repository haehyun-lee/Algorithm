import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 단지 번호 붙이기 + <그림2> 처럼 2차원 배열 단지 순서대로 번호 세팅
public class Ex_2667_print {
    public static int N;
    public static int[][] map;                  // 지도
    public static ArrayList<Integer> house;     // 단지별 집의 수
    public static int seq = 1;
    public static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        map = new int[N][N];
        house = new ArrayList<>();
        visited = new boolean[N][N];

        // 0과 1로 구성된 입력 받기
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 집에 대하여 집 연결 체크
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = dfsHouse(i, j);
                if (count != 0) {
                    house.add(count);
                    seq++;
                }
            }
        }

        // 단지수, 단지별 집의 수(오름차순)
        System.out.println(house.size());

        Collections.sort(house);
        for (int i : house) {
            System.out.println(i);
        }

        // 2차원 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    // map[i][j] 위치에서 집 연결(=단지) 카운트
    private static int dfsHouse(int i, int j) {
        if (i < 0 || j < 0 || i >= N || j >= N) {
            return 0;
        }

        // 현 위치가 집이 있는 곳일 경우
        if (map[i][j] == 1 && !visited[i][j]) {
            // 방문 처리
            visited[i][j] = true;
            map[i][j] = seq;
            int top = dfsHouse(i - 1, j);
            int bottom = dfsHouse(i + 1, j);
            int left = dfsHouse(i, j - 1);
            int right = dfsHouse(i, j + 1);

            return top + bottom + left + right + 1;
        }
        return 0;
    }
}

