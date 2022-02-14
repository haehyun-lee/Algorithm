import java.util.Arrays;
import java.util.Scanner;

// 수 정렬하기 2
public class Ex_2751_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        quicksort(array, 0, N - 1);

        for(int i : array) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left > right) {     // 탐색 범위가 요소 한개로 한정되었을 경우 정렬 끝
            return;
        }

        int pi = partition(array, left, right);   // 배열에서 pivot 값의 위치
        quicksort(array, left, pi - 1);      // pivot 보다 작은 수 영역 퀵정렬
        quicksort(array, pi + 1, right);      // pivot 보다 큰 수 영역 퀵정렬
    }

    public static int partition(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        swap(array, left, mid);

        int pivot = array[left];
        int i = left, j = right;

        while (i < j) {
            while (pivot < array[j]) {
                j--;
            }

            while (i < j && array[i] <= pivot) {
                i++;
            }
            swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
