import java.util.ArrayList;

public class DFS {
    public static boolean[] visited = new boolean[9];       // 1~8 노드 방문 여부
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();  // 노드 연결 정보

    // DFS(Depth-First Search)
    public static void dfs(int x) {
        // 현재 노드를 방문 처리
        visited[x] = true;
        System.out.print(x + " ");

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문 (최하위 노드까지 갔으면 다시 상위 노드 반복문으로 돌아와 다음 노드 탐색)
        for (int y : graph.get(x)) {
            if (!visited[y])
                dfs(y);
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 각 노드에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        // 1을 시작 노드로 DFS 실행
        dfs(1);
    }
}
