import java.util.Scanner;
import java.util.StringTokenizer;

// 음계
public class Ex_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        StringBuffer sb = new StringBuffer();

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        String str = sb.toString();
        if (str.equals("12345678")) {
            System.out.println("ascending");
        } else if (str.equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
