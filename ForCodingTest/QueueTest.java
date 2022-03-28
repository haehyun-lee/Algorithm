import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Fist In First Out 구조
        queue.offer(5);     // 삭제
        queue.offer(2);     // 삭제
        queue.offer(3);
        queue.offer(7);
        queue.poll();
        queue.offer(1);
        queue.offer(4);
        queue.poll();
        
        // 먼저 들어온 원소부터 출력
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
