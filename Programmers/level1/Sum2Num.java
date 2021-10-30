package level1;

import java.util.ArrayList;
import java.util.List;

//두 정수의 합
public class Sum2Num {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        for(int i=a; i<=b; i++){
            answer += i;
        }

        return answer;
    }
    
    //등차수열의 합 공식 : |b-a|*(a+b)/2
    public long solution2(int a, int b) {
    	List<Integer> list = new ArrayList<Integer>();
    	list.stream().mapToInt(Integer::intValue).toArray();
    	return (Math.abs(b - a) + 1) * (long)(a + b) / 2;   	 
    }
}
