import java.util.Scanner;

// 평균
public class Ex_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            max = Math.max(max, score[i]);
        }

        for(int i = 0; i < n; i++){
            sum += ((double)score[i] / max) * 100;
        }

        System.out.print(sum / n);
    }
}
