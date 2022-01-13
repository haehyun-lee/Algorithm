package level2;

import java.util.Arrays;

// 최솟값 만들기
public class Minimum {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length -1 -i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
