import java.util.Scanner;

// 크로아티아 알파벳
public class Ex_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        int count = 0;

        // 시작하는 문자에 따라 체크 (c, d, l, n, s, z)
        for (int i = 0; i < str.length(); i++) {
            char first = str.charAt(i);                                     // 시작 문자
            char second = i + 1 < str.length() ? str.charAt(i + 1) : 'a';   // 다음 문자
            char third = i + 2 < str.length() ? str.charAt(i + 2) : 'a';    // 다다음 문자
            count++;

            switch (first) {
                case 'c':               // c=, c-
                    if (second == '=' || second == '-')
                        i++;            // i ~ i+1 까지 한 문자이므로 다음 문자 1개 패스
                    break;
                case 'd':               // d-, dz=
                    if (second == '-')
                        i++;
                    else if (second == 'z' && third == '=')
                        i += 2;         // i ~ i+2 까지 한 문자이므로 다음 문자 2개 패스
                    break;
                case 'l': case 'n':     // lj, nj
                    if (second == 'j')
                        i++;
                    break;
                case 's': case 'z':     // s=, z=
                    if(second == '=')
                        i++;
                    break;
            }
        }

        System.out.println(count);
    }
}
