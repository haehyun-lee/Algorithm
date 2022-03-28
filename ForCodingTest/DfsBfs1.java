import java.util.Scanner;

// 음료수 얼려 먹기
public class DfsBfs1 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // 특정 노드를 방문한 뒤에 연결된 모든 노드들도 방문 처리
    public static boolean dfs(int i, int j) {
        // 얼음틀 범위 벗어나면 종료
        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        // 현재 노드를 아직 방문하지 않았다면
        if (graph[i][j] == 0) {
            // 현재 노드 방문 처리
            graph[i][j] = 1;
            // 상, 하, 좌, 우 위치도 재귀호출 (연결된 0 부분 한 묶음으로 방문처리)
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i, j + 1);

            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();      // 버퍼 지우기

        // 2차원 정수 배열 입력받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드(위치)에 대하여 음료수 채우기
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 현재 위치에서 DFS 수행, 해당 위치에서 아이스크림 가능 여부 체크
                if (dfs(i, j))
                    result++;
            }
        }

        System.out.println(result);
    }
}
