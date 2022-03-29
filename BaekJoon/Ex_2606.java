import java.util.*;

// 바이러스
public class Ex_2606 {
    public static boolean[] visited = new boolean[101];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 노드 수
        int M = sc.nextInt();   // 간선 수
        sc.nextLine();

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 노드 연결 정보
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        // 1번 노드와 연결된 노드 개수 출력
        System.out.println(bfsCount(1));
    }

    // 특정 노드와 연결된 노드 개수 반환
    public static int bfsCount(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : graph.get(x)) {
                if (!visited[y]) {
                    count++;
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }

        return count;
    }
}
