import java.util.Scanner;

// 하노이 탑 이동 순서
public class Ex_11729 {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 원판 이동 횟수
        System.out.println((int) Math.pow(2, n) - 1);

        // 원판 이동 과정
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    /**
     * N개의 원판 이동 과정을 StringBuffer에 추가
     * @param N 원판의 개수
     * @param start 출발지
     * @param mid 목적지까지 옮기기 위해 이용하는 중간지점
     * @param to 목적지
     */
    public static void hanoi(int N, int start, int mid, int to) {
        // 종료조건 : 이동할 원반 수가 1개일 경우
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // 1. N-1개를 A에서 B로 이동 (=start 지점의 N-1개 원판을 mid 지점으로 옮김)
        hanoi(N-1, start, to, mid);

        // 2. 1개를 A에서 C로 이동 (=start 지점의 N번째 원판을 to 지점으로 옮김)
        hanoi(1, start, mid, to);

        // 3. N-1개를 B에서 C로 이동 (=mid 지점의 N-1개 원판을 to 지점으로 옮김)
        hanoi(N - 1, mid, start, to);
    }
}
