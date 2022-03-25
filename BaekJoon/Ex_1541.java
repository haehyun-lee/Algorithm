import java.util.Scanner;
import java.util.StringTokenizer;

/*
잃어버린 괄호
식에 괄호를 쳐서 값을 최소로 만들기
값을 최소로 만들어야 하므로, - 바로 뒤에서 () 괄호 쳐야함. 즉, 빼기 연산에서 최대한 큰 수를 빼는 식으로 식 전개
가장 처음과 마지막 문자는 숫자라고 했으므로, 첫 피연산자가 음수일 경우는 고려할 필요X
 */
public class Ex_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFirst = true;
        int result = 0;

        String exp = sc.nextLine();
        // 빼기(-) 연산을 기준으로 문자열 분리
        StringTokenizer stMinus = new StringTokenizer(exp, "-");
        StringTokenizer stPlus = null;

        // 빼기(-) 연산을 경계로 괄호치기, 빼기(-) 연산이 없을 시 토큰은 자기자신을 반환함. 이때는 더하기(+) 연산만 수행.
        while (stMinus.hasMoreTokens()) {
            // 더하기(+) 연산을 기준으로 문자열 분리
            stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            if (isFirst) {
                while (stPlus.hasMoreTokens()) {
                    result += Integer.parseInt(stPlus.nextToken());
                }
                isFirst = false;
            } else {
                while (stPlus.hasMoreTokens()) {
                    result -= Integer.parseInt(stPlus.nextToken());
                }
            }
        }

        System.out.println(result);
    }
}
