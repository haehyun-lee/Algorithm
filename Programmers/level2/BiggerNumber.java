package level2;

public class BiggerNumber {
    public int solution(int n) {
        int cntOne = Integer.bitCount(n);

        while (true) {
            n++;    // n보다 큰 수 차례로 접근
            if (cntOne == Integer.bitCount(n)) {
                return n;
            }
        }
    }
}
