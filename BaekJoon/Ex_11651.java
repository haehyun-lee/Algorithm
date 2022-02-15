import java.util.Arrays;
import java.util.Scanner;

// 이차원 배열 정렬, 정렬기준 정의
public class Ex_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());        // 점의 개수
        int[][] pos = new int[N][2];                    // 점의 좌표

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String[] dot = str.split(" ");

            pos[i][0] = Integer.parseInt(dot[0]);       // x좌표
            pos[i][1] = Integer.parseInt(dot[1]);       // y좌표
        }

        // 1. y좌표 오름차순 정렬, 2. x좌표 오름차순 정렬
        Arrays.sort(pos, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }else{
                return o1[1] - o2[1];
            }
        });

        for (int[] arr : pos) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
