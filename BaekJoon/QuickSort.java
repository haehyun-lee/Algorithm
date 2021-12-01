import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {80, 70, 60, 50, 40, 30, 20};
        System.out.println(Arrays.toString(array));

        quicksort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pi = partition(array, left, right);       // pivot을 기준으로 영역 분할 후, pivot값 위치를 반환

        quicksort(array, left, pi - 1);     // pivot 보다 작은 그룹에 대해 quick sort 수행
        quicksort(array, pi + 1, right);     // pivot 보다 큰 그룹에 대해 quick sort 수행
    }

    // pivot을 기준으로 왼쪽은 pivot보다 작은 수들이, 오른쪽에는 pivot보다 큰 수들이 존재하도록 교환
    public static int partition(int[] array, int left, int right) {
        int mid = (left + right) / 2;   // pivot으로 지정할 가운데 값을 제일 왼쪽으로 치워두기
        swap(array, left, mid);

        int pivot = array[left];        // 첫번재 요소(가운데 있던 값)를 pivot으로 선택
        int i = left, j = right;

        // i와 j가 만날때까지 반복
        while (i < j) {
            // 오른쪽에서부터 pivot 보다 작은 수 찾을 때까지 반복
            while (pivot < array[j]) {
                j--;
            }
            
            // 왼쪽부터 j 이전까지 pivot 보다 큰 수 찾을 때까지 반복
            while (i < j && array[i] <= pivot) {
                i++;
            }
            swap(array, i, j);      // 왼쪽에서 pivot보다 큰수와 오른쪽에서 pivot보다 작은 수 교환
        }
        // i와 j가 만난 요소를 pivot과 교환
        array[left] = array[i];
        array[i] = pivot;
        return i;
    }

    // 배열 요소 위치 변경
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
