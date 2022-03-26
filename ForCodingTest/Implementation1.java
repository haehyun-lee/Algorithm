import java.util.Scanner;
import java.util.StringTokenizer;

// 상하좌우 - 시뮬레이션 유형
public class Implementation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int row = 1, col = 1;
        
        while (st.hasMoreTokens()) {
            switch (st.nextToken()) {
                case "L":
                    if (col > 1)
                        col--;
                    break;
                case "R":
                    if (col < n)
                        col++;
                    break;
                case "U":
                    if (row > 1)
                        row--;
                    break;
                case "D":
                    if (row < n)
                        row++;
                    break;
            }
        }

        System.out.println(row + " " + col);
    }
}
