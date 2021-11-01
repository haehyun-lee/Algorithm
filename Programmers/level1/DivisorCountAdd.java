package level1;

//약수의 개수와 덧셈
public class DivisorCountAdd {
	//약수의 개수가 짝수일 경우 더하기, 홀수일 경우 빼기
	public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            if(countDivisor(i) % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        
        return answer;
    }
    
	//약수 개수 반환
    public int countDivisor(int i){
        int cnt = 0;
        for(int j=1; j <= i; j++){
           if(i % j == 0){
               cnt++;
           }
        }
        return cnt;
    }
}
