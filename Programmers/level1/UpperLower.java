package level1;

//이상한 문자 만들기 (대/소문자)
public class UpperLower {
	public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = s.split("");
        int cnt = 0;
        
        for(String str : strArr){
            cnt = str.contains(" ") ? 0 : cnt + 1;
            sb.append(cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase());
        }     
        
        return sb.toString();
    }
}
