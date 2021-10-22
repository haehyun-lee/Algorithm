package level1;

import java.util.Arrays;

public class GymClothes {
	/**
	 * 체육수업을 들을 수 있는 학생 수 반환
	 * @param n			전체 학생의 수
	 * @param lost		체육복을 도난당한 학생들의 번호 배열
	 * @param reserve	여벌의 체육복을 가져온 학생들의 번호 배열
	 * @return 			체육수업을 들을 수 있는 학생의 최대값
	 */
	static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;		//현재 체육복이 있는 인원 수
		
		Arrays.sort(lost);
		Arrays.sort(reserve);

		//여벌 체육복을 가져온 학생이 도난당한 경우 본인 것 사용
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					System.out.printf("%d은 본인의 체육복을 사용.\n", lost[i]);
					answer++;
					lost[i] = -1;			//앞으로 사용 못하게 막기
					reserve[j] = -1;
					break;
				}
			}
		}
		
		//체육복을 도난당한 학생에게 여벌 체육복을 빌려줌
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
					System.out.printf("%d에게 %d의 체육복을 빌려줌.\n", lost[i], reserve[j]);
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, 3, 5 };
		int[] reserve = { 2, 3 };
		
		int cnt = solution(n, lost, reserve);
		
		System.out.println("체육수업을 들을 수 있는 학생은 "+ cnt +"명 입니다.");
	}
}
