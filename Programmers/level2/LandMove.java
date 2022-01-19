package level2;

// 땅따먹기
public class LandMove {
    int solution(int[][] land) {
        int answer = 0;

        // 행 개수대로 반복
        for (int i = 1; i < land.length; i++) {
            // i번째 행의 각 열에 대해 = 해당 칸 점수 + 이전 행에서 특정 열을 제외한 최대값
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        // 마지막 행의 최대값
        for (int i : land[land.length - 1]) {
            answer = Math.max(answer, i);
        }

        return answer;
    }
}
