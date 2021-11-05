package level1;

//없는 숫자 더하기
public class AddNotInNum {
	public int solution(int[] numbers) {
        int answer = 45;
        for(int number : numbers)
            answer -= number;
        
        return answer;
    }
}
