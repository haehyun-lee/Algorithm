import java.util.*;

public class Ex_1260 {
    public static boolean[] visited = new boolean[1001];                    // 노드 방문 여부
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();  // 노드 연결 정보

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정점, 간선 개수, 탐색 시작 정점
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        sc.nextLine();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 노드 연결 정보 입력받기
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(sc.nextLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 작은 값의 노드부터 접근하도록 오름차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);

        // 노드 방문 여부 초기화
        Arrays.fill(visited, false);
        System.out.println();

        bfs(v);
    }

    private static void dfs(int x) {
        // 현재 노드 방문처리
        visited[x] = true;
        System.out.print(x + " ");

        for (int y : graph.get(x)) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
    
    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        // 시작 노드 삽입, 방문 처리
        q.offer(start);
        visited[start] = true;

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 기준 노드 추출
            int x = q.poll();
            System.out.print(x + " ");

            // 기준 노드에 연결된 노드 중 아직 방문하지 않은 노드 삽입, 방문 처리
            for (int y : graph.get(x)) {
                if (!visited[y]) {
                    visited[y] = true;  // 이미 추가한 노드를 다시 추가하지 않기 위함
                    q.offer(y);
                }
            }
        }
    }

}
