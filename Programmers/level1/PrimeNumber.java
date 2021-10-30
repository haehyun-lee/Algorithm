package level1;

import java.util.ArrayList;

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
	
	//에라토스테네스의 체
	public int Eratos(int n) {
		int cnt = 0;
		ArrayList<Boolean> primeList = new ArrayList<Boolean>(n+1);
		
		//0번째와 1번째는 소수 아님
		primeList.add(false);		
		primeList.add(false);
		
		//2~n까지 소수로 설정
		for(int i=2; i<=n; i++) {
			primeList.add(i, true);
		}
		
		//2부터 n의 제곱근보다 작을 때까지, 각각의 배수들을 지운다.
		for(int i=2; (i*i) <= n; i++) {
			if(primeList.get(i)) {
				for(int j = i*i; j <= n; j += i) {	//i*i 미만은 이미 이전 i의 반복에서 처리되었으므로 j의 시작값은 i*i로 최적화 가능
					primeList.set(j, false);		//i의 배수는 소수 아님
				}
			}
		}
		
		for(int i=0; i<=n; i++) {
			if(primeList.get(i) == true) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
