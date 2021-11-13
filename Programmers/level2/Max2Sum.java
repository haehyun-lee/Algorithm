package level2;

//가장 큰 두 수의 합 구하기 (조합)
public class Max2Sum {
	static int N = 4;
	static int[] Nums = { 1, 2, 3, 4 };
	
	/**
	 * 
	 * @param pos	현재 위치
	 * @param cnt	선택된 개수
	 * @param val	중간 계산 결과
	 * @return
	 */
	static int solution(int pos, int cnt, int val) {
		if(cnt == 2) return val;	//2개 선택됨
		if(pos == N) return -1;		//끝까지 이동함
		
		int max = 0;
		max = Math.max(max, solution(pos + 1, cnt + 1, val + Nums[pos]));	//선택하고
		max = Math.max(max, solution(pos + 1, cnt, val));					//선택안하고
		
		return max;
	}
	
	public static void main(String[] args) {
		
	}
}
