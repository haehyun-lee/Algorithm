package level1;

//문자열을 정수로 바꾸기
public class StringToInt {
	public int solution(String s) {
		int answer = 0;
        boolean sign = true;
        char start = s.charAt(0);
        
        if(start == '-' || start == '+'){
            sign = (start == '-') ? false : true;
            s = s.substring(1);
        }
        
        for(char ch : s.toCharArray()){
            answer = answer * 10 + (ch - '0');
        }
        
        return (sign ? +answer : -answer);
	}
	
	public int solution2(String s) {
		int answer = 0;
        boolean sign = true;
        char ch = s.charAt(0);
        
        if(ch <= '1' && '9' <= ch){
            sign = (ch == '-') ? false : true;  //부호 저장
            s = s.substring(1);                 //부호 자르기
        }
        
        answer = Integer.parseInt(s);
        
        return (sign ? +answer : -answer);
	}
}
