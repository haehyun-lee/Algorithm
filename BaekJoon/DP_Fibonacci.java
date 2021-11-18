// 피보나치 수열
public class DP_Fibonacci {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.fibBottomUp(5));
		System.out.println(s.fibBottomUp(35));
		System.out.println(s.fibTopDown(5));
		System.out.println(s.fibBottomUp(35));
	}	
}

class Solution {	
	// 재귀 방식
	public int fibRecur(int n) {
		if(n <= 1)
			return n;
		else 
			return fibRecur(n-1) + fibRecur(n-2);
	}
	
	// 반복문 방식
	public int fibLoop(int n) {
		if(n <= 1)
			return n;
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i = 2; i < n+1; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
	}
	
	// DP Top-Down 방식
	int[] memo;		//Top-Down 메모 배열
	public int fibTopDown(int n) {
		if(n <= 1)
			return n;
		
		memo = new int[n+1];
		
		if(memo[n] != 0) {
			return memo[n];
		}
		else {
			memo[n] = fibTopDown(n-1) + fibTopDown(n-2);
		}
		
		return memo[n];
	}
	
	// DP Bottom-Up 방식
	public int fibBottomUp(int n) {
		if(n <= 1)
			return n;
		
		int[] bottomUpMemo = new int[n+1];
		bottomUpMemo[0] = 0;
		bottomUpMemo[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			bottomUpMemo[i] = bottomUpMemo[i-1] + bottomUpMemo[i-2];
		}
		
		return bottomUpMemo[n];
	}
}
