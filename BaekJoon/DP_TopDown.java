public class DP_TopDown {

    public static long[] d = new long[100];         // 계산 결과 메모

    // 재귀 함수
    public static long fibo(int x) {
        System.out.print("f(" + x + ") ");
        // 종료 조건, 첫번째와 두번째 피보나치 수는 1로 고정
        if (x == 1 || x == 2)
            return 1;

        // 이미 계산한 적 있는 문제라면 결과 반환
        if (d[x] != 0)
            return d[x];

        // 아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}