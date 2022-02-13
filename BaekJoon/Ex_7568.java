import java.util.Scanner;

// 덩치
public class Ex_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int t = sc.nextInt();
        int[][] arr = new int[t][2];

        for (int i = 0; i < t; i++) {
            arr[i][0] = sc.nextInt();   // 몸무게
            arr[i][1] = sc.nextInt();   // 키
        }

        for (int i = 0; i < arr.length; i++) {
            int rank = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i == j) { continue; }

                // 자신보다 몸무게, 키가 큰 사람이 존재함
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank + 1 + " ");
        }

        System.out.println(sb);
    }
}
