import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);

            sb.append(a+b + "\n");
        }

        System.out.print(sb);
    }
}
