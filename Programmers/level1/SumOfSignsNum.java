package level1;

//음양 정수 더하기

public class SumOfSignsNum {
	/**
	 * 정수의 절대값, 부호 배열에서 실제 정수들의 합(양수/음수)을 구하여 반환
	 * @param absolutes	정수의 절대값 배열
	 * @param signs		정수의 부호 배열 (true : +, false : -)
	 * @return 			실제 정수들의 합
	 */
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			answer += signs[i] ? +absolutes[i] : -absolutes[i];		//부호연산자
		}
		
		return answer;
	}
}