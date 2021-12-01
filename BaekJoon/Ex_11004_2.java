import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// k번째 수 찾기 (Quick Sort 방식으로 변경 예정)
public class Ex_11004_2 {
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        quicksort(nums, 0, N-1);        // 배열 오름차순 퀵정렬

        System.out.println(nums[K-1]);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(array, left, right);     // pivot
        
        // K번째 수 위치를 반환하거나, 정렬 범위 축소
        if(pi+1 == K) {                             // K번째 수를 기준으로 작은 수, 큰 수가 분할됨
            return;
        } else if (pi+1 < K) {                      // pivot 보다 큰 수 영역에 K번째 수가 존재 => pivot 기준 오른쪽 수들에 정렬 필요
            quicksort(array, pi+1, right);
        }else{                                      // pivot 보다 작은 수 영역에 K번째 수가 존재 => pivot 기준 왼쪽 수들에 정렬 필요
            quicksort(array, left, pi-1);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int mid = (left + right) / 2;   // 가운데 값
        swap(array, left, mid);         // 가운데 값을 가운데로

        int pivot = array[left];        // 옮긴 가운데 값을 기준으로 설정
        int i = left, j = right;

        while (i < j) {
            while (pivot < array[j]) {
                j--;
            }

            while (i < j && pivot >= array[i]) {
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
