package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 기능 개발 (스택/큐)
public class FunctionDevelop {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> workDate = new LinkedList<>();       // 개발 기간
        ArrayList<Integer> release = new ArrayList<>();     // 배포당 기능 개수

        // 각 기능이 개발되기까지 남은 기간
        for (int i = 0; i < progresses.length; i++) {
            workDate.add((int)Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }

        int front = workDate.poll();
        int count = 1;

        while (!workDate.isEmpty()) {
            if (front < workDate.peek()) {  // 앞 기능보다 뒷 기능이 늦게 구현됨
                release.add(count);
                count = 1;
                front = workDate.poll();
            } else {                        // 앞 기능보다 뒷 기능이 먼저 구현됨
                count++;
                workDate.poll();
            }
        }
        release.add(count);                 // 마지막 값은 isEmpty 조건에 걸려서 별도 추가

        return release.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
