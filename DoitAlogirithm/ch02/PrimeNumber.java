package ch02;

//1부터 1000까지의 소수 나열
public class PrimeNumber {

	public static void main(String[] args) {
		int counter = 0;
		boolean isPrime;
		
		for(int n = 2; n <= 1000; n++) {
			isPrime = true;
			for(int i = 2; i < n; i++) {
				counter++;
				//2부터 n-1사이 정수로 나누어떨어질 경우 
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
