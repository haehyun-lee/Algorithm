package level2;

import java.util.Arrays;
import java.util.Comparator;

// 가장 큰 수
class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];

        // int[] -> String[] 변환
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                System.out.println(o1 + "과 " + o2 + " 비교 결과 : " + (o2 + o1).compareTo(o1 + o2));
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if(strNumbers[0].equals("0")) return "0";

        return String.join("", strNumbers);
    }
}

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        Solution sol = new Solution();
        System.out.println(sol.solution(numbers));
    }
}
