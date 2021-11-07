package level1;

//신규 아이디 추천
public class NewId {
	public String solution(String new_id) {
        String answer = new_id.toLowerCase();			//소문자 치환
        
        answer = answer.replaceAll("[^a-z0-9-_.]*", "");	//조건 문자 제외 모든 문자 제거
        answer = answer.replaceAll("[.]{2,}", ".");			//연속 마침표 하나로
        answer = answer.replaceAll("^[.]|[.]$", "");		//앞뒤 마침표 제거
        
        //빈 문자열일 경우
        if(answer.isEmpty())		
        	answer = "a";
        
        //문자열 길이가 16이상일 경우
        if(answer.length() >= 16)	
        	answer = answer.substring(0, 15).replaceAll("[.]$", "");
        
        //문자열 길이가 2이하일 경우
        if(answer.length() <= 2) {
        	char ch = answer.charAt(answer.length()-1);
        	while(answer.length() < 3)
        		answer += ch;
        }
        
        return answer;
    }
}
