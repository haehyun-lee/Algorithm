import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 좌표 압축
public class Ex_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = sc.nextInt();

        int[] origin = new int[N];  // 원본 배열
        int[] sorted = new int[N];  // 정렬 후 배열
        HashMap<Integer, Integer> rankMap = new HashMap<>();    // 좌표 값 rank

        // 두 배열에 동시 입력받기
        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = sc.nextInt();
        }
        
        // 오름차순으로 rank 매기기
        Arrays.sort(sorted);
        int rank = 0;
        
        for (int x : sorted) {
            if (!rankMap.containsKey(x)) {
                rankMap.put(x, rank++);
            }
        }
        
        // rank는 입력 순으로 출력하기 때문에 origin을 유지해둔 것
        for (int x : origin) {
            sb.append(rankMap.get(x) + " ");
        }

        System.out.print(sb);
    }
}
