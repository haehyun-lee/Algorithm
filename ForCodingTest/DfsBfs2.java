import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
미로 탈출
너비우선탐색 BFS, Queue 사용
상하좌우 이동 : dx[], dy[] 각 방향별 이동 거리 선언
기준 노드가 갱신되면서 상하좌우 노드를 탐색하며 계속 새로운 노드로 길을 진행한다.
새로운 노드는 몬스터가 없으며 아직 방문하지 않은 노드기 때문에 1 그대로 유지된 상태.
 */
class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class DfsBfs2 {
    public static int n, m;
    public static int[][] graph = new int[201][201];

    // 상하좌우 이동 패턴
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 위에서 전역으로 선언해두고 또 실수로 int n 과 같이 지역변수로 선언하지 않게 주의
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        // 시작 노드 삽입
        q.offer(new Node(x, y));

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 기준 노드 추출 (기준 노드는 괴물이 없는 곳이기 때문에 값이 무조건 1이상)
            Node node = q.poll();

            // 기준 노드의 상하좌우 노드 탐색 (기준 노드의 인접노드 먼저 탐색 : bfs)
            for (int i = 0; i < 4; i++) {
                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                // 최초로 방문한 곳은 1, 이전에 거친 곳은 2 이상 값을 가짐
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] += graph[node.getX()][node.getY()];
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return graph[n - 1][m - 1];
    }
}