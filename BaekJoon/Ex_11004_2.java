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

        quicksort(nums, 0, N - 1);

        System.out.println(nums[K-1]);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;     // 정렬 끝
        }

        int pi = partition(array, left, right);
        // K번째 수의 위치는 K-1
        if(pi+1 == K) {
            return;
        } else if (pi+1 < K) {
            quicksort(array, pi+1, right);
        }else{
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
