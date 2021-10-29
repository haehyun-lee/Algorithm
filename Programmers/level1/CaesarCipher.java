package level1;

//시저 암호
public class CaesarCipher {
    public String solution(String s, int n) {
    	String answer = "";
        n = n % 26;                     						//n이 26(알파벳 개수)를 넘을 경우 대비
        char[] chArr = s.toCharArray();
        
        for(char ch : chArr){
            if(Character.isUpperCase(ch)){
                ch = (char)(((ch - 'A' + n) % 26) + 'A');		//ch+n 값이 26을 넘을 경우 대비 (대/소문자 구간 벗어나지 않게)
            }else if(Character.isLowerCase(ch)){
                ch = (char)(((ch - 'a' + n) % 26) + 'a'); 
            }
            
            answer += ch;
        }
        
        return answer;
    }
}
