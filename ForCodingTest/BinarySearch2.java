import java.util.Arrays;
import java.util.Scanner;

// 부품 찾기
public class BinarySearch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가게에 있는 부품
        int n = sc.nextInt();
        int[] parts = new int[n];
        for (int i = 0; i < n; i++) {
            parts[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품
        int m = sc.nextInt();
        int[] request = new int[m];
        for (int i = 0; i < m; i++) {
            request[i] = sc.nextInt();
        }

        // 이진 탐색은 정렬된 데이터에만 가능
        Arrays.sort(parts);
        
        // 가게에 손님이 요청한 부품이 있는지 차례로 출력
        for (int part : request) {
            int result = binarySearch(parts, part, 0, n - 1);
            System.out.print((result == -1) ? "no " : "yes ");
        }
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
