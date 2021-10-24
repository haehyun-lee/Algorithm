package level1;

//자릿수 더하기
public class SumDigit {
	public int solution(int n) {
        int answer = 0;
        
        while(n != 0){
            answer += n % 10;
            n /= 10;
        }

        System.out.println(n);

        return answer;
    }
}
