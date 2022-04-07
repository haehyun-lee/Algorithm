import java.util.Scanner;

/*
이진 탐색
배열 내부의 데이터가 정렬되어 있어야 사용 가능
탐색 범위를 절반씩 좁혀가며 데이터를 탐색한다.
탐색 범위의 시작점, 끝점, 중간점 필요
찾으려는 데이터와 중간점 위치에 있는 데이터를 반복적으로 비교해서 원하는 데이터를 찾는다.
 */
public class BinarySearch {

    public static int binarySearchRecursive(int[] array, int target, int start, int end) {
        if (start > end)
            return -1;                  // 탐색 실패 (start가 end 보다 커졌다는 건, 범위가 원소 한개로 줄여질 때까지 mid값 비교를 수행했으나 target을 찾지 못한 경우

        int mid = (start + end) / 2;    // 중간점 (소수점 버리기)

        if (array[mid] == target) {     // 탐색 성공
            return mid;
        } else if (array[mid] < target) {   // 중간점 값이 타겟 값보다 작은 경우, 왼쪽 버리기
            return binarySearchRecursive(array, target, mid + 1, end);
        } else {    // 중간점 값이 타겟 값보다 큰 경우, 오른쪽 버리기
            return binarySearchRecursive(array, target, start, mid - 1);
        }
    }


    public static int binarySearchLoop(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {         // 탐색 성공
                return mid;
            } else if (array[mid] < target) {   // 중간점의 값보다 찾고자 하는 값이 큰 경우
                start = mid + 1;
            } else {                            // 중간점의 값보다 찾고자 하는 값이 작은 경우
                end = mid - 1;
            }
        }

        return -1;  // 탐색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 원소 개수
        int target = sc.nextInt();  // 찾고자 하는 문자열

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // 이진 탐색 - 재귀
        int result = binarySearchRecursive(array, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result + 1);
        }

        // 이진 탐색 - 반복문
        int result2 = binarySearchLoop(array, target, 0, n - 1);
        if (result2 == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result2 + 1);
        }
    }
}
