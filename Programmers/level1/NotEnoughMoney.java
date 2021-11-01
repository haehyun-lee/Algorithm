package level1;

//부족한 금액 계산하기
public class NotEnoughMoney {
	public long solution(int price, int money, int count) {
        long answer = money;				//소지금
        
        for(int i = 0; i < count; i++){
            answer -= price * (i + 1);		//소지금 - 이용금액
        }
        
        return answer > 0 ? 0 : -answer;
    }
}
