import java.util.Scanner;

// Fly me to the Alpha Centauri
public class Ex_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x, y, distance, max;

        for (int t = 0; t < T; t++) {
            x = sc.nextInt();   // 현재 위치
            y = sc.nextInt();   // 목표 위치

            distance = y - x;   // 거리

            max = (int) Math.sqrt(distance);    // 최대 이동 거리

            if (max == Math.sqrt(distance)) {               // max가 변하는 지점
                System.out.println(max * 2 - 1);
            } else if (distance <= (max * max) + max) {     // max가 변하는 두 지점 사이 구간
                System.out.println(max * 2);
            } else {
                System.out.println(max * 2 + 1);
            }
        }
    }
}