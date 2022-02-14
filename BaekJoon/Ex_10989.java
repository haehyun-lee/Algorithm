import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 정렬하기 3
public class Ex_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];   // 수 카운트 배열
        int[] result = new int[N];      // 정렬된 배열

        // 수 카운팅
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 정렬된 배열 만들기
        int idx = 0;
        for (int i = 0; i < 10001; i++) {
            while (count[i] > 0) {
                result[idx++] = i;
                count[i]--;
            }
        }

        // 정렬된 배열 출력
        for (int i : result) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}
