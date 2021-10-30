package level1;

import java.util.*;

//문자열 내 마음대로 정렬하기
public class SortStrings {
	//n의 자리 값을 기준으로 정렬
	public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);							//오름차순(=사전순) 정렬 (n자리 값이 같은 string 대비)
        
        for(int i=0; i < strings.length-1; i++){
            for(int j=0; j < strings.length-i-1; j++){
                if(strings[j].charAt(n) > strings[j+1].charAt(n)){	//n자리 값이 큰 걸 오른쪽으로 이동
                    String tmp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = tmp;
                }
            }
        }
        
        return strings;
    }
	
	//compare 메서드 오버라이딩 (대소 비교 기준)
	public static String[] solution2(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				if(s1.charAt(n) > s2.charAt(n)) { return 1; }
				else if(s1.charAt(n) == s2.charAt(n)) { return s1.compareTo(s2); }
				else { return 0; }
			}
		});
		
		return strings;
	}
	
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		System.out.println(String.join(", ", solution2(strings, 2)));
	}
}