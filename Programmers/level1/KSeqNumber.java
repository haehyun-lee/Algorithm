package level1;

import java.util.Arrays;

//K번째 수
public class KSeqNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			// 배열 i부터 j까지 자르기 (범위 복사)
			int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

			// 오름차순 정렬
			Arrays.sort(arr);

			// k번째 수 찾기
			answer[i] = arr[commands[i][2] - 1];
		}

		return answer;
	}
}
