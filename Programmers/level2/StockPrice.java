package level2;

import java.util.Arrays;

// 주식 가격 (스택/큐)
public class StockPrice {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];              // 가격이 떨어지지 않은 기간(초)

        // 마지막 요소 결과는 무조건 0이기에 제외
        for (int i = 0; i < prices.length -1; i++) {
            // 현재 요소보다 뒤에 있는 요소들 순차 체크
            for (int j = i + 1; j < prices.length; j++) {
                answer[i] += 1;
                // 현재 요소 값보다 작을 경우 (가격이 떨어짐)
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }
}
