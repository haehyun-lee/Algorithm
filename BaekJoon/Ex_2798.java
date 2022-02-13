import java.util.Scanner;

// 블랙잭
public class Ex_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 카드 개수
        int M = sc.nextInt();   // 목표 숫자

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }

        int max = search(card, N, M);
        System.out.println(max);
    }

    static int search(int[] arr, int N, int M) {
        int max = 0;

        // 카드 3개 선택
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // 카드 3개 합
                    int sum = arr[i] + arr[j] + arr[k];
                    
                    if (sum == M) {
                        return sum;
                    } else if (sum < M) {
                        max = Math.max(sum, max);
                    }
                }
            }
        }
        return max;
    }
}
