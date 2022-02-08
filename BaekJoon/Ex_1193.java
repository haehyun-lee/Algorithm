import java.util.Scanner;

// 분수찾기
public class Ex_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currCount = 1;      // 현재 대각선 칸 개수
        int prevCountSum = 0;   // 이전 대각선 칸 개수 누적 합

        while (true) {
            // 현재 대각선의 마지막 순번보다 작거나 같음
            if (n <= prevCountSum + currCount) {

                if (currCount % 2 == 0) {   // 대각선 개수가 짝수면 위 → 아래
                    System.out.println((n - prevCountSum) + "/" + (currCount - (n - prevCountSum - 1)));
                } else {                    // 대각선 개수가 홀수면 아래 → 위
                    System.out.println((currCount - (n - prevCountSum - 1)) + "/" + (n - prevCountSum));
                }
                break;

            } else {
                prevCountSum += currCount;
                currCount++;        // 대각선 칸 개수는 1칸씩 늘어남 (1, 2, 3, ...)
            }
        }
    }
}
