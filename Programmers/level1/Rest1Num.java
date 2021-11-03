package level1;

//나머지가 1이 되는 수 찾기
public class Rest1Num {
	public int solution(int n) {
        for(int i=1; ; i++){
            if(n % i == 1)
                return i;
        }
    }
	
	public int solution2(int n) {
		int answer = 0;
		
		for(int i=1; ; i++){
            if(n % i == 1) {
            	answer = i;
                break;
            }                
        }
		
		return answer;
	}
}
