import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] array = new Integer[N];   // int[] 타입은 Collections.reverseOrder() 사용 불가

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        
        // 기본 정렬 라이브러리를 이용하여 내림차순 정렬
        Arrays.sort(array, Comparator.reverseOrder());

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
