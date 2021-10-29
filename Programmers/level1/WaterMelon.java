package level1;

//수박수박 문자열 반복
public class WaterMelon {
	public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=1; i<=n; i++){
            answer.append((i % 2 != 0) ? "수" : "박");
        }
        
        return answer.toString();
    }
}
