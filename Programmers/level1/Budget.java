package level1;

import java.util.Arrays;

//예산을 받는 최대 부서 개수
public class Budget {
	public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);			//최대한 많은 부서를 지원해주기 위해 신청 금액이 적은 순으로 정렬(오름차순)
        
        for(int cost : d){
            budget -= cost;		//예산 - 부서 금액
            
            if(budget < 0){
                break;			//예산이 음수가 될 경우 해당 부서는 지원 못 해줌. count전에 반복 중단
            }
            
            count++;
        }
        
        return count;			
    }
}
