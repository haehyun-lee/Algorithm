import java.util.Scanner;

// 평균은 넘겠지
public class Ex_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int[] scores = new int[n];
            int sum = 0;
            float avg = 0;
            int count = 0;
            float percent = 0;

            // 성적 입력 받기
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            // 평균을 넘는 학생 비율 (소수점 셋째자리까지)
            avg = (float) sum / n;
            for (int score : scores) {
                if(score > avg)
                    count++;
            }
            percent = (float) (Math.round(((float) count / n) * 100 * 1000)) / 1000;
            sb.append(String.format("%.3f", percent) + "%\n");
        }

        System.out.print(sb);
    }
}
