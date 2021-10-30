package level1;

import java.util.Arrays;
import java.util.Collections;

//문자열 내림차순으로 배치하기 (소문자>대문자, Z>A)
public class DescString {
	public String solution(String s) {
        String[] strArr = s.split("");

        Arrays.sort(strArr, Collections.reverseOrder());

        return String.join("", strArr);
    }
}