import java.util.Scanner;

/*
왕실의 나이트
 */
public class Implementation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int count = 0;

        char[] input = sc.nextLine().toCharArray();
        int row = input[1] - '0';           // 행
        int column = input[0] - 'a' + 1;    // 열

        // 이동 패턴(8가지)에 따른 row, column 이동 거리
        int[][] steps = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

        // 이동 패턴 차례대로 적용
        for (int[] step : steps) {
            int nextRow = row + step[0];
            int nextColumn = column + step[1];

            // 이동 후 위치가 체스판 내일 경우 (=이동 가능)
            if (nextRow >= 1 && nextColumn >= 1 && nextRow <= n && nextColumn <= n)
                count++;
        }

        System.out.println(count);
    }
}
