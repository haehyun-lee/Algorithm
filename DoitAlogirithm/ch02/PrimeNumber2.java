package ch02;

//1부터 1000까지의 소수 나열 (성능 개선 1 - 소수 판단 조건)
public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) {
					break;
				}
			}
			//for문을 끝까지 수행했을 경우 (2~n-1 값으로 딱 나누어떨어지지 않았음)
			if(i == n) {
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}

/*
 * for문 반복 종료 시점에서 변수 i의 값
 * 1) n이 소수인 경우 : n과 같은 값	(for문이 끝까지 실행됨)
 * 2) n이 합성수인 경우 : n보다 작은 값 (for문이 중단됨)
 */
