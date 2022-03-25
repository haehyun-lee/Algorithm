import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
주유소
주유 비용을 최소화하기 위해 리터당 가격이 싼 기름을 넣기.
곱셈 과정에서 오버플로우 주의
 */
public class Ex_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 도시 개수

        BigInteger[] road = new BigInteger[n - 1];              // 각 도시를 연결하는 도로의 길이 (1km 이동 = 1L 기름 사용)
        BigInteger[] oil = new BigInteger[n];                   // 각 도시에 있는 주유소의 기름 가격 (1L 당 가격)

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n - 1; i++) {
            road[i] = new BigInteger(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            oil[i] = new BigInteger(st.nextToken());
        }

        // 처음 주유소는 무조건 이용
        BigInteger result = oil[0].multiply(road[0]);
        BigInteger minPrize = oil[0];

        // 마지막 - 1 번째 주유소까지만 이용 가능
        for (int i = 1; i < oil.length - 1; i++) {
            // 지금까지 거친 주유소 중 최저가 vs 현재 주유소
            if (oil[i].compareTo(minPrize) < 0) {
                result = result.add(oil[i].multiply(road[i]));
                minPrize = oil[i];
            } else {
                result = result.add(minPrize.multiply(road[i]));
            }
        }

        System.out.println(result);
    }
}