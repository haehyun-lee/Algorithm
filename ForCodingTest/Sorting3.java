import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 두 배열의 원소 교체
public class Sorting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] array1 = new Integer[N];
        Integer[] array2 = new Integer[N];

        for (int i = 0; i < N; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            array2[i] = sc.nextInt();
        }
        
        // 배열A 오름차순, 배열B 내림차순 정렬
        Arrays.sort(array1);
        Arrays.sort(array2, Comparator.reverseOrder());

        for (int i = 0; i < K; i++) {
            // 배열A 원소가 배열B 원소보다 작을 때만 교환
            if (array1[i] > array2[i])
                break;
            
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        int sum = 0;
        for (int i : array1) {
            sum += i;
        }

        System.out.println(sum);
    }
}
