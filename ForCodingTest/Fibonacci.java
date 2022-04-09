public class Fibonacci {
    // 한 번 계산된 결과를 메모이제이션 하기 위한 배열 초기화
    public static long[] d = new long[100];

    private static long fiboRecursive(int x) {
        // 종료 조건
        if (x == 1 || x == 2){
            return 1;
        }

        // 이미 계산한 적 있는 값
        if (d[x] != 0) {
            return d[x];
        }

        d[x] = fiboRecursive(x - 1) + fiboRecursive(x - 2);
        return d[x];
    }

    private static long fiboLoop(int x) {
        d[1] = 1;
        d[2] = 1;

        for (int i = 3; i <= x; i++) {
            d[i] = d[i - 1] + d[i + 1];
        }

        return d[x];
    }

    public static void main(String[] args) {
        System.out.println(fiboRecursive(50));
        System.out.println(fiboLoop(50));
    }
}
