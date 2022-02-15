import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소트인사이드
public class Ex_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        char[] arr = br.readLine().toCharArray();
        int[] count = new int[10];

        // 0~9 빈도 카운팅
        for (char ch : arr) {
            count[ch - '0']++;
        }

        // 9~0 내림차순 출력
        for (int i = 9; i >= 0; i--) {
            while (count[i]-- > 0) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
