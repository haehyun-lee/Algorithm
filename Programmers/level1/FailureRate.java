package level1;

import java.util.*;

//실패율 - 프렌즈 사천성
public class FailureRate {
	//스테이지 정보
	static class Stage{
		int num;			//스테이지 번호
		double failRate;	//실패율
		
		public Stage(int num, double failRate) {
			this.num = num;
			this.failRate = failRate;
		}
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] userStopCnts = new int[N+2];		//각 stage에 머물러있는 플레이어 수, 마지막 스테이지를 클릭어한 경우를 포함시키기 위해 N+2
        int[] userTotalCnts = new int[N+1];		//각 stage에 도달한 플레이어 수
        
        //스테이지별 머물러 있는 플레이어 수 카운트
        for(int i=0; i < stages.length; i++) {
        	userStopCnts[stages[i]]++;    	
        }
        
        //스테이지별 도달 플레이어 수 카운트
        userTotalCnts[N] = userStopCnts[N] + userStopCnts[N+1];
        for(int i = N-1; i >= 1; i--) {
        	userTotalCnts[i] = userStopCnts[i] + userTotalCnts[i+1];	//현재 스테이지 머물러 있는 수 + 다음 스테이지에 도달한 수
        }
        
        ArrayList<Stage> failRates = new ArrayList<>();
        for(int i=1; i <= N; i++) {
        	if(userTotalCnts[i] == 0) {
        		failRates.add(new Stage(i, 0));
        		continue;
        	}

            //실패율 계산
        	double failRate = (double)userStopCnts[i] / userTotalCnts[i];
        	failRates.add(new Stage(i, failRate));
        }
        
        //Stage 객체의 failRate를 기준으로 내림차순 정렬
        Collections.sort(failRates, ((o1, o2) -> Double.compare(o2.failRate, o1.failRate)));
        
        for(int i=0; i < failRates.size(); i++) {
        	answer[i] = failRates.get(i).num;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] result = solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
		System.out.println(Arrays.toString(result));
	}
}
