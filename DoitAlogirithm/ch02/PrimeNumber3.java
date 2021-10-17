package ch02;

//1부터 1000까지의 소수 나열 (성능 개선 2 - 소수 배열, n이하 소수로 나누기)
public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0;							//나누기 횟수
		int ptr = 0;								//소수개수 (index용)
		int[] prime = new int[500];					//현재까지 발견한 소수 목록
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n += 2) {
			int i;
			for(i = 1; i < ptr; i++) {				//n보다 작은 소수로 나누기
				counter++;
				if(n % prime[i] == 0) {
					break;
				}
			}
			
			if(i == ptr) {
				prime[ptr++] = n;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);	//14622
	}
}
