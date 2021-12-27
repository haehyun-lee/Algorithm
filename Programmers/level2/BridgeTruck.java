package level2;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭 (스택/큐)
public class BridgeTruck {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;   // 시간
        int sum = 0;    // 다리 위 트럭의 총 무게

        Queue<Integer> queue = new LinkedList<>();     // 다리 큐

        for (int truck_weight : truck_weights) {
            // 해당 트럭이 들어가려면 앞 트럭들이 빠질때까지 기다려야하기 때문에, 현재 트럭이 들어갈 때까지 무한 반복
            while (true) {
                if (queue.isEmpty()) {                        // 다리가 비어 있을 경우
                    queue.add(truck_weight);
                    sum += truck_weight;
                    time++;
                    break;
                } else if (queue.size() == bridge_length) {   // 다리가 다 차 있을 경우
                    int truck = queue.poll();
                    sum -= truck;
                    time++;
                    if (sum + truck_weight <= weight) {       // 현재 트럭이 들어가도 무게제한 안 걸릴 경우
                        queue.add(truck_weight);
                        sum += truck_weight;
                        break;
                    } else {
                        queue.add(0);
                    }
                } else {                                      // 다리가 다 차지는 않았을 경우
                    time++;
                    if (sum + truck_weight <= weight) {       // 현재 트럭이 들어가도 무게제한 안 걸릴 경우
                        queue.add(truck_weight);
                        sum += truck_weight;
                        break;
                    } else {
                        queue.add(0);
                    }
                }
            }
        }

        return time + bridge_length;        // 마지막에 올라간 트럭이 다리를 지날 시간 추가
    }

    public static void main(String[] args) {
        int bridge_length = 100;
        int weigth = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        System.out.println(solution(bridge_length, weigth, truck_weights));
    }
}
