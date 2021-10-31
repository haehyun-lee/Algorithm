package level1;

//가운데 글자 가져오기
public class CenterString {
	public String solution(String s) {
        int center = (s.length()-1) /2 ;
        
        if(s.length() % 2 ==0){
            return s.substring(center, center+2);
        }else{
            return String.valueOf(s.charAt(center));
        }
    }
	
	public String solution2(String s) {
        return s.isEmpty() ? "" : s.substring((s.length()-1)/2, s.length()/2+1);
    }
}
