package ch02;

//1부터 1000까지의 소수 나열 (성능 개선 3 - n의 제곱근보다 이하 소수로 나누기)
public class PrimeNumber4 {

	public static void main(String[] args) {
		int counter = 0;									//곱셈과 나눗셈의 횟수
		int ptr = 0;										//찾은 소수의 개수
		int[] prime = new int[500];							//소수를 저장하는 배열
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int n = 5; n <= 1000; n += 2) {					//대상은 홀수만
			boolean flag = false;
			for(int i=1; prime[i]*prime[i] <= n; i++) {		//대상은 n의 제곱근 이하 소수만
				counter += 2;								//곱셈+나눗셈 한번에 카운트
				if(n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = n;
				counter++;									//곱셈
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);	//3608
	}
}
