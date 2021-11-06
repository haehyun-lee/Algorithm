package level2;

//카펫 (완전탐색)
public class Carpet {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int sumOfTwoSides = brown / 2;
		for (int col = sumOfTwoSides - 1; col >= sumOfTwoSides / 2; col--) {
			int row = sumOfTwoSides - col;
			// 각자 다른 가로, 세로와 겹치는 한칸 제외
			// 가로2 세로3의 경우보다 가로3 세로2의 경우가 먼저 걸리게됨
			if ((row - 1) * (col - 1) == yellow) {
				answer[0] = col + 1;
				answer[1] = row + 1;
				return answer;
			}
		}

		return answer;
	}
}
