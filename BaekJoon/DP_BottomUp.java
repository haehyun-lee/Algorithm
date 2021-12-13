public class DP_BottomUp {
    public static long[] d = new long[100];

    public static void main(String[] args) {
        // 첫번째, 두번째 피보나치수는 고정
        d[1] = 1;
        d[2] = 1;
        int n = 50;         // 50번째 피보나치 수 계산

        // 상향식 반복문
        for (int i = 3; i <= n; i++) {
            System.out.print("f(" + i + ") ");
            d[i] = d[i - 1] + d[i - 2];
        }

        System.out.println(d[n]);
    }
}
