import java.util.Arrays;
import java.util.Scanner;

// 피타고라스 정리 : 직각삼각형에서 빗변 길이의 제곱은 다른 두 변의 길이의 제곱의 합과 같다.
public class Ex_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int[] line = new int[3];    // 세 변의 길이
        
        while (true) {
            line[0] = sc.nextInt();
            line[1] = sc.nextInt();
            line[2] = sc.nextInt();
            if(line[0] == 0) { break; }
            
            // 오름차순 정렬. 빗변은 가장 길이가 큰 변
            Arrays.sort(line);

            // 빗변 길이 제곱 == 두 변의 길이의 제곱의 합
            if (line[2] * line[2] == (line[0] * line[0] + line[1] * line[1])) {
                sb.append("right" + "\n");
            } else {
                sb.append("wrong" + "\n");
            }
        }

        System.out.println(sb);
    }
}
