package level1;

import java.util.*;

public class SumNumbers {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new TreeSet<>();
        
        for(int i=0; i < numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        return arr;
    }
}
