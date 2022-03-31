import java.util.Arrays;

public class Sorting {
    public static int MAX_VALUE = 9;

    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int[] array2 = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};

//        selectionSort(array);
//        insertSort(array);
//        quickSort(array, 0, array.length - 1);
        countSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    /*
    선택 정렬
    현재 정렬되지 않은 데이터 중에서 가장 작은 데이터를 앞으로 이동한다.
    시간 복잡도 : O(N²)
     */
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    /*
    삽입 정렬
    앞까지의 데이터는 이미 정렬되어 있다는 가정하에 특정한 데이터를 적절한 위치에 삽입한다.
    현재 리스트가 거의 정렬되어 있는 상태라면 매우 빠르게 동작. ↔ 퀵 정렬
    시간 복잡도 : O(N²) ~ O(N)
     */
    private static void insertSort(int[] array) {
        // i : 시작 위치, j : 중간 이동 위치, j-1 : 자신의 왼쪽 원소
        for (int i = 1; i < array.length; i++) {
            // 한 칸씩 왼쪽으로 이동
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    // 스와프(swap)
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                } else {
                    // 왼쪽같이 자신보다 작으면 그 위치에서 멈춤
                    break;
                }
            }
        }
    }

    /*
    퀵 정렬
    가장 많이 사용되는 알고리즘.
    일반적인 겨웅에서 평균적으로 빠르게 동작하기 때문에 데이터의 특성을 파악하기 어렵다면 퀵 정렬 추천
    기준 데이터(pivot)를 설정하고 그 기준보다 큰 수와 작은 수를 교환한 후 리스트를 반으로 나눈다.
    피벗을 설정하고 리스트를 분할하는 방법에 따라 퀵정렬이 구분된다.
    호어 분할 방식 : 리스트에서 처선째 데이터를 피벗으로 정한다.
    평균 시간 복잡도 : O(NlogN)
    최악의 경우 : O(N²) - 호어 분할 방식인데, 이미 데이터가 정렬되어 있는 경우(피벗 분리만 반복될뿐) ↔ 삽입정렬
     */
    private static void quickSort(int[] array, int start, int end) {
        if (start >= end)       // 원소가 1개인 경우 종료
            return;

        int pivot = start;      // 피벗은 첫번째 원소
        int left = start + 1;   // 피벗보다 큰 데이터의 위치
        int right = end;        // 피벗보다 작은 데이터의 위치

        while (left <= right) {
            // 왼쪽에서부터 오른쪽 끝까지 피벗보다 큰 데이터 찾기
            while (left <= end && array[left] <= array[pivot]) {
                left++;
            }

            // 오른쪽에서부터 왼쪽 피벗 앞까지 피벗보다 작은 데이터 찾기
            while (right > start && array[right] >= array[pivot]) {
                right--;
            }

            if (left > right) {     // 엇갈렸다면 작은 데이터를 피벗과 교환 (그 위치가 중간 값 자리)
                int temp = array[pivot];
                array[pivot] = array[right];
                array[right] = temp;
            } else {    // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교환
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        // 분할 이후 피벗의 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행 (재귀)
        quickSort(array, start, right - 1);     // array[right]와 array[pivot] 값이 바뀌었으니 현재 피벗의 위치는 right
        quickSort(array, right + 1, end);
    }

    /*
    계수 정렬
    데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때만 사용 가능
    가장 큰 데이터와 가장 작은 데이터의 차이가 1,000,000을 넘지 않을 때, 동일한 값을 가지는 데이터가 여러 개 등장할 때 적합
    자연수 데이터 개수 N, 데이터 중 최대값 K 일 때 시간 복잡도 : O(N+K)
     */
    private static void countSort(int[] array) {
        int[] count = new int[MAX_VALUE + 1];

        // 데이터 값과 동일한 인덱스 + 1
        for (int i : array) {
            count[i]++;
        }

        // i 데이터를 count[i] 만큼 배열에 추가
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[index++] = i;
            }
        }
    }
}
