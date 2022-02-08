import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다
public class Ex_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());   // 달팽이가 낮에 올라가는 높이
        long b = Long.parseLong(st.nextToken());   // 달팽이가 밤에 내려가는 높이
        long v = Long.parseLong(st.nextToken());   // 나무막대 높이

        System.out.println((long) Math.ceil((double) (v - a) / (a - b)) + 1);
    }
}