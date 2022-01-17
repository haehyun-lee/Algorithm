package level2;

import java.util.Arrays;
import java.util.StringTokenizer;

// 최솟값, 최댓값
public class MinMax {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2);

        return arr2[0] + " " + arr2[arr2.length - 1];
    }


//    public String solution(String s) {
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while (st.hasMoreTokens()) {
//            int num = Integer.parseInt(st.nextToken());
//            // 최솟값, 최댓값 비교
//            min = Math.min(min, num);
//            max = Math.max(max, num);
//        }
//
//        return min + " " + max;
//    }
}
