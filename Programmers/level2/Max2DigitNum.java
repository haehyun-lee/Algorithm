package level2;

//가장 큰 두자리 수 구하기 (순열)
public class Max2DigitNum {
	static int N = 4;
	static int[] Nums = { 1, 2, 3, 4 };
	
	/**
	 * 
	 * @param cnt	자릿수
	 * @param used	사용되었는지 여부
	 * @param val	중간 계산 결과
	 * @return
	 */
	static int solution(int cnt, int used, int val) {
		if(cnt == 2) { return val; }
		
		int max = 0;
		for(int i =0; i<N; ++i) {
			if((used & 1 << i) != 0) { continue; }
			max = Math.max(max, solution(cnt + 1, used | 1 << i, val * 10 + Nums[i]));
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(solution(0, 0, 0));
	}

}
