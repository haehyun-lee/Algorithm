import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 수의 개수 (홀수)
        int sum = 0;
        int[] arr = new int[N];
        int[] count = new int[8001];                // 입력 범위 : -4000 ~ +4000

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
            count[n + 4000]++;
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 최빈값 계산
        int maxCount = 0;               // 최대 빈도

        int mode = Integer.MIN_VALUE;   // 최빈값
        boolean isMode = false;         // 빈도수가 같은 값이 나왔었는지 여부

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                // 새로운 최빈값이 나올 경우
                maxCount = count[i];

                mode = i - 4000;
                isMode = false;
            } else if (count[i] == maxCount && isMode == false) {
                // 최빈값이 여러개일 경우 두번째로 작은 값을 저장
                mode = i - 4000;
                isMode = true;
            }
        }

        // 산술평균, 중앙값, 최빈값, 범위
        System.out.println(Math.round((float) sum / N));
        System.out.println(arr[N/2]);
        System.out.println(mode);
        System.out.println(Math.abs(arr[arr.length - 1] - arr[0]));
    }
}
