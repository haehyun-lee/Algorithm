import java.util.Scanner;

// 오븐 시계
public class Ex_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startHH = sc.nextInt();     // 현재 시각(시)
        int startMM = sc.nextInt();     // 현재 시각(분)
        int cookMM = sc.nextInt();      // 필요한 시각(분)

        startMM += cookMM;

        // 60분 = 1시간
        if (startMM > 59) {
            startHH += startMM / 60;
            startMM %= 60;
        }

        // 24시 = 0시
        if (startHH > 23) {
            startHH %= 24;
        }

        // 종료시간 출력
        System.out.printf("%d %d", startHH, startMM);
    }
}
