import java.util.Scanner;

// N과 M (1)
public class Ex_15649 {
    public static int[] arr;            // 수열 값
    public static boolean[] visit;      // 노드 방문 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();           // 숫자 범위 : 1~N
        int M = sc.nextInt();           // 숫자 개수

        arr = new int[M];
        visit = new boolean[N];

        // 1~N 자연수에 대해 길이 M의 수열 출력, 깊이 0부터 시작
        dfs(N, M, 0);
    }

    public static void dfs(int N, int M, int depth) {
        // 수열은 자연수 M개 조합
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            // 아직 방문하지 않은 노드(숫자)일 경우 수열에 추가
            if (!visit[i]) {
                visit[i] = true;                // 해당 노드를 방문 상태로 변경
                arr[depth] = i + 1;             // 자연수는 1부터 시작
                dfs(N, M, depth + 1);     // 다음 자식 노드 방문, 재귀 호출

                visit[i] = false;               // 다시 방문 상태 리셋
            }
        }
    }
}
