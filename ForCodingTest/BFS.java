import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    
    // BFS(Breath-First Search)
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        // 시작 노드 삽입
        queue.offer(start);
        // 현재 노드 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 처리할 노드를 꺼냄
            int x = queue.poll();
            System.out.print(x + " ");
            // 인접 노드 중 아직 방문하지 않은 노드를 큐에 추가
            for (int y : graph.get(x)) {
                if (!visited[y]){
                    queue.offer(y);
                    visited[y] = true;  // 중복 노드 추가 방지용 방문 처리
                }
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<>());   // ArrayList 요소로 ArrayList 객체를 추가
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

        // 1을 시작노드로 BFS 실행
        bfs(1);
    }
}
