import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int a = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        System.out.print(Math.max(a, b));
    }
}
