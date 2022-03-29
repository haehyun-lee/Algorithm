import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 단지 번호 붙이기
public class Ex_2667 {
    public static ArrayList<Integer> houses = new ArrayList<>();;     // 단지별 집의 수
    public static int N;
    public static int[][] map;      // 지도

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        map = new int[N][N];

        // 0과 1로 구성된 입력 받기
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 모든 집에 대하여 집 연결 체크
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = dfsHouse(i, j);
                if (count != 0)
                    houses.add(count);
            }
        }

        // 단지수, 단지별 집의 수(오름차순)
        System.out.println(houses.size());

        Collections.sort(houses);
        for (int i : houses) {
            System.out.println(i);
        }
    }

    // map[i][j] 위치에서 집 연결(=단지) 카운트
    private static int dfsHouse(int i, int j) {
        // 범위를 벗어나면 무시
        if (i < 0 || j < 0 || i >= N || j >= N){
            return 0;
        }

        // 현 위치가 집이 있는 곳일 경우
        if (map[i][j] != 0) {
            // 방문 처리
            map[i][j] = 0;
            int top = dfsHouse(i - 1, j);
            int bottom = dfsHouse(i + 1, j);
            int left = dfsHouse(i, j - 1);
            int right = dfsHouse(i, j + 1);

            return 1 + top + bottom + left + right;
//            return 1 + dfsHouse(i - 1, j) + dfsHouse(i + 1, j) + dfsHouse(i, j - 1) + dfsHouse(i, j + 1);
        }
        return 0;
    }
}
