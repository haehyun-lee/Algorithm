package level3;

import java.util.Arrays;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;             // 네트워크 순번
        int[] network = new int[n]; // 각 컴퓨터가 속하는 네트워크 번호 (0: 아직 아무 네트워크에도 포함되지 않음)

        for (int i = 0; i < n; i++) {
            // 다른 네트워크에 포함되어 있지 않을 경우
            if (network[i] == 0) {
                answer++;
                dfs(computers, i, answer, network);
            }
        }

//        System.out.println(Arrays.toString(network));

        return answer;
    }

    private void dfs(int[][] computers, int start, int networkNo, int[] network) {
        if (network[start] == 0) {
            network[start] = networkNo;
        }

        for (int i = 0; i < computers[start].length; i++) {
            // 자기자신 제외, 다른 네트워크에 포함되지 않았으며, 자신과 연결된 타 컴퓨터
            if (start != i && computers[start][i] == 1 && network[i] == 0) {
                dfs(computers, i, networkNo, network);
            }
        }
    }

    public static void main(String[] args) {
        Network sol = new Network();
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        int result = sol.solution(3, computers);
        System.out.println(result);
    }
}
