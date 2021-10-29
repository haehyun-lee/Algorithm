package level1;

//소수 찾기
public class PrimeNumber {
	public int solution1(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++){
            int j;
            for(j = 2; j < i; j++){
                if(i % j == 0){
                    break;                  //반복문 도중 나누어 떨어지는 수 발견
                }
            }
            if(j == i){
                answer++;                   //반복문 끝까지 나누어 떨어지는 수 발견안됨
            }
        }
        
        return answer;
    }
	
	public int solution2(int n) {
        int answer = 0;
        int idx = 0;
        int[] prime = new int[500];
        
        prime[idx++] = 2;                   //2는 첫번째 소수
        answer++;
        
        for(int i = 3; i <= n; i+=2){       //짝수는 제외 
            int j;
            for(j = 1; j < idx; j++){		//i는 홀수이므로 prime[0] 2로는 비교할 필요X
                if(i % prime[j] == 0){
                    break;
                }
            }
            if(j == idx){
                prime[idx++] = i;
                answer++;
            }
        }
        
        return answer;
	}
	
	public int solution3(int n) {
		if(n == 2) { return 1; }         	//연산 대상으로 홀수만 사용할것이기 때문에 유일한 짝수 소수인 2는 미리거르기
        
        int answer = 0;
        int idx = 0;
        int[] prime = new int[1000000];
        
        prime[idx++] = 2;
        prime[idx++] = 3;
        answer+=2;
        
        for(int i = 5; i <= n; i+=2){                       //홀수만
            boolean isPrime = true;
            for(int j = 1; prime[j] * prime[j] <= i; j++){  //제곱근 이하 소수만
                if(i % prime[j] == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                prime[idx++] = i;
                answer++;
            }
        }
        
        return answer;
	}
}
