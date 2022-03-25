import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
회의실 배정
회의 시간이 겹치지 않는 선에서 희의의 최대 개수 구하기
한 회의가 끝나는 것과 동시에 다름 회의 시작하기
서로 겹치지 않는 활동에 대해 종료시간이 빠르면 더 많은 활동을 선택할 수 있는 시간이 많아진다. => 종료시간이 포인트
종료시간 -> 시작시간
 */
public class Ex_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int[][] time = new int[n][2];  // [][0]: 시작시간, [][1]: 종료시간
        for (int i = 0; i < n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        // 정렬 (종료시간 오름차순 -> 시작시간 오름차순)
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같은 경우 시작시간이 빠른 순으로 정렬
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return (o1[1] - o2[1]);
                }
            }
        });

        // 하나의 회의가 끝나면 바로 시작할 수 있는 회의를 우선 할당
        int prevEndTime = 0;
        for (int i = 0; i < n; i++) {
            if (time[i][0] >= prevEndTime) {
                count++;
                prevEndTime = time[i][1];
            }
        }

        System.out.println(count);
    }
}
