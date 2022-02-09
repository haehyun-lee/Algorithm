import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔
public class Ex_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int h, w, n;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());   // 층 수
            w = Integer.parseInt(st.nextToken());   // 각 층의 방 수
            n = Integer.parseInt(st.nextToken());   // 몇 번째 손님

            if (n % h == 0) {   // 최상층 딱 떨어짐
                sb.append((h * 100) + (n / h) + "\n");
            } else {            // 다음 방으로 넘어감
                sb.append((n % h * 100) + (n / h + 1) + "\n");
            }
        }
        System.out.print(sb);
    }
}
