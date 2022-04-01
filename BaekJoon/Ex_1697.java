import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
숨바꼭질
BFS, 1차원 배열
 */
public class Ex_1697 {
    static int N, K;
    static int[] visited = new int[100001];     // 0: 아직 방문안한 위치, 0 이외의 값 : 해당 위치에 들린 초

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N));
    }

    private static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        visited[N] = 1;     // 배열 기본값 0(아직 방문하지 않은 위치)과 구분하기 위해 1초부터 시작

        while (!q.isEmpty()) {
            int n = q.poll();

            // 동생의 위치에 도착함
            if (n == K) {
                return visited[n] - 1;      // -1초
            }

            // x-1, x+1, x*2 이동 후 초 기록. 인덱스 범위 안벗어나게 주의
            if (n - 1 >= 0 && visited[n - 1] == 0) {
                visited[n - 1] = visited[n] + 1;
                q.offer(n - 1);
            }
            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                visited[n + 1] = visited[n] + 1;
                q.offer(n + 1);

            }
            if (n + 1 <= 100000 && visited[n * 2] == 0) {
                visited[n * 2] = visited[n] + 1;
                q.offer(n * 2);
            }
        }

        return -1;
    }
}
