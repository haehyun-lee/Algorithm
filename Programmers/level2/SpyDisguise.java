package level2;

import java.util.HashMap;

// 위장 (해시)
public class SpyDisguise {
    public static int solution(String[][] clothes) {
        int answer = 1;     // 0 *= i 방지용

        // 옷 종류별 개수
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            System.out.println(clothe[1]);
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        System.out.println(map);

        // 모든 옷 조합의 수
        for (Integer i : map.values()) {
            answer *= i.intValue() + 1;
        }

        return answer - 1;    // 모든 종류의 옷을 입지 않은 경우 빼기
    }

    public static void main(String[] args) {
        String[][] clothes = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        System.out.println(solution(clothes));


    }
}
