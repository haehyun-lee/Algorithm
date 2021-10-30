package level1;

//3진법 뒤집기 - 10진수를 3진수로 변환한 뒤, 3진수를 앞뒤로 뒤집은 값을 10진수로 변환
public class TrinaryDigit {
	public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        
        while(n > 0){
            sb.append(n % 3);		//45 -> 0021 (실제 3진수 값은 1200, 원래라면 뒤집어야 3진수값)
            n /= 3;
        }
        
        sb.reverse();				//0021 -> 1200
        
        //3진수값 1200을 뒤집은 0021의 10진수 값을 얻어야 하기에, 뒤집지 않은 1200의 앞에서 부터를 3^0, 3^1, ..자리로 취급
        for(int i=0; i<sb.length(); i++){
            answer += ((int)sb.charAt(i) - '0') * (Math.pow(3, i));
        }
        
        return answer;
    }
	
	public int solution2(int n) {
		String trit = "";
		
		//3진법 결과의 거꾸로를 10진수로 변환
		while(n > 0) {
			trit += (n % 3);
			n /= 3;
		}
		
		return Integer.parseInt(trit, 3);
	}
}
