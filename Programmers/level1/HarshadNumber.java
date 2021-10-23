package level1;

//하샤드 수(x의 자릿수의 합으로 x가 나누어짐) 판단
public class HarshadNumber {
	public static boolean solution(int x) {
		int tmp = x;
		int sum = 0;						//x의 자릿수의 합
		
		do {
			sum += tmp % 10;				//1의 자릿수 더하기
			tmp /= 10;						//1의 자릿수 제외
		} while(tmp != 0);
		
		return (x % sum == 0);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));	//true
		System.out.println(solution(12));	//true
		System.out.println(solution(11));	//false
		System.out.println(solution(13));	//false
	}
}