package level2;

public class TargetNumber {
    public static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public void dfs(int[] numbers, int target, int depth, int sum){
        // 마지막 원소까지 다 더했을 때, target 값과 일치하는지 확인
        if(depth == numbers.length){
            if(sum == target) answer++;
        } else {
            // +numbers[depth], -numbers[depth] 두 경우의 수
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }
    }
}
