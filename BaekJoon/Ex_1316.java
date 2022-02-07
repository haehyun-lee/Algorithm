import java.util.Arrays;
import java.util.Scanner;

// 그룹 단어 체커
public class Ex_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < N; i++) {
            Arrays.fill(alphabet, false);   // 알파벳 등장 여부 초기화

            String str = sc.nextLine();
            char before = str.charAt(0);        // 이전 문자
            int j = 0;

            for (j = 0; j < str.length(); j++) {
                char curr = str.charAt(j);
                // 이전에 나온적 있는데, 앞 문자와 다를 경우 (연속으로 사용된 게 아닐 경우)
                if (before != curr && alphabet[curr - 'a'] == true) {
                    break;
                }
                alphabet[curr - 'a'] = true;
                before = curr;
            }
            // for문 중간에 break 걸리지 않고 끝까지 진행됐을 경우 그룹단어 OK
            if (j == str.length()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
