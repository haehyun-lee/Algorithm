import java.util.Scanner;
import java.util.StringTokenizer;

// 문자열 반복
public class Ex_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int tc = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < tc; i++){
            st = new StringTokenizer(sc.nextLine(), " ");
            int r = Integer.parseInt(st.nextToken());   // 반복 횟수
            String str = st.nextToken();                // 기존 문자열
            // 각 문자를 r번 반복
            for(String s : str.split("")){
                for(int j = 0; j < r; j++){
                    sb.append(s);
                }
            }

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
