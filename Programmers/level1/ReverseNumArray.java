package level1;

//자연수 뒤집어 배열로 만들기
public class ReverseNumArray {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] chArr = str.toCharArray();
        
        int[] answer = new int[chArr.length];
        
        for(int i=0; i < chArr.length; i++){
            answer[chArr.length-i-1] = chArr[i]-'0';
        }
        
        return answer;
    }
    
    public int[] solution2(long n) {
    	String str = String.valueOf(n);
    	int[] answer = new int[str.length()];
    	int idx = 0;
    	
    	while(n > 0) {
    		answer[idx++] = (int)(n % 10);		//n은 long타입, answer는 int[]타입. long타입 값을 int배열에 넣을 수 없음
    		n /= 10;
    	}
    	
    	return answer;
    }
}
