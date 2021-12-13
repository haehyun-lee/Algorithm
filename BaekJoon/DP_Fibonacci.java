// 피보나치 수열 f(x) = f(x-1) + f(x-2)
public class DP_Fibonacci {
	// 재귀 함수
	public static int fibo(int x) {
		if (x == 1 || x == 2) {
			return 1;
		}
		return fibo(x - 1) + fibo(x - 2);
	}
	public static void main(String[] args) {
		System.out.println(fibo(4));
	}	
}
