package level1;

import java.util.ArrayList;
import java.util.Collections;

public class SumNumbers {
	public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int sum = 0;
        
        for(int i=0; i < numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i == j)
                    continue;
                
                sum = numbers[i] + numbers[j];
                if(!answer.contains(sum)){
                    answer.add(sum);
                }
            }
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
