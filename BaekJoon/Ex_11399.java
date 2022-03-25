import java.util.Arrays;
import java.util.Scanner;

/*
ATM
각 사람이 돈을 인출하는데 필요한 시간의 합을 최소로 하려면
필요 시간이 작은 사람부터 인출해야 한다. => 오름차순 정렬
 */
public class Ex_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }
        
        Arrays.sort(time);

        int result = time[0];           // 첫번째 사람 인출 시간 = 본인 인출시간
        for (int i = 1; i < n; i++) {
            time[i] += time[i - 1];     // 앞 사람 인출 시간 + 본인 인출시간
            result += time[i];          // 인출시간의 합
        }

        System.out.println(result);
    }
}
