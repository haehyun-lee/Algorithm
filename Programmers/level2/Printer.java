package level2;

import java.util.Collections;
import java.util.PriorityQueue;

// 프린터 (스택/큐)
public class Printer {
    public static  int solution(int[] priorities, int location) {
        int answer = 1;

        // 우선순위 큐에 문서 우선순위 저장
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            queue.offer(priority);
        }

        // 우선순위 높은 순으로
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 기존 배열에서 우선순위의 값 찾기
                if (queue.peek() == priorities[i]) {
                    if (i == location) {
                        return answer;
                    }
                    answer++;
                    queue.poll();       // 값을 찾았을 때만 큐에서 빼야함
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int locaton = 2;
        System.out.println(solution(priorities, locaton));
    }
}
