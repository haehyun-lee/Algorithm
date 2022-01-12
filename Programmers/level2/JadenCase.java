package level2;

import java.util.Arrays;

// JadenCase 문자열 만들기
public class JadenCase {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        boolean isFirst = true;

        String[] arr = s.toLowerCase().split("");

        for (String str : arr) {
            sb.append(isFirst ? str.toUpperCase() : str);
            isFirst = str.equals(" ") ? true : false;
        }

        return sb.toString();
    }
}
