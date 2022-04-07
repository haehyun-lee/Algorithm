import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 떡의 개수
        int m = sc.nextInt();   // 요청한 떡의 길이

        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        Arrays.sort(array);

        // 시작점 : 0, 끝점 : 가장 긴 떡의 길이 (오름차순 정렬한 배열의 마지막 원소)
        int result = binarySearch(array, m, 0, array[array.length - 1]);
        System.out.println(result);
    }

    private static int binarySearch(int[] array, int m, int start, int end) {
        int max = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            // 떡 자르기 (절단기 길이보다 짧은 떡은 0처리)
            int total = 0;
            for (int x : array) {
                if (x > mid)
                    total += (x - mid);
            }

            if (total == m) {             // 자른 떡이 손님이 요청한 길이와 일치하는 최선책
                return mid;
            } else if (total < m) {       // 자른 떡이 손님이 요청한 길이보다 작음 -> 절단기 길이 줄이기
                end = mid - 1;
            } else {                      // 자른 떡이 손님이 요청한 길이보다 큼 -> 절단기 길이 늘리기 (최대한 요청 길이에 맞추도록)
                start = mid + 1;
                max = mid;
            }
        }

        // 손님이 요청한 길이에 딱 맞게 자르진 못하고 자투리 떡을 주게 되는 차선책
        return max;
    }
}
