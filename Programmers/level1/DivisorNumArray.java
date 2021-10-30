package level1;

import java.util.*;
import java.util.stream.IntStream;

//나누어 떨어지는 숫자 배열
public class DivisorNumArray {
	//forEach + Stream
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            return new int[] {-1};
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	//Stream
	public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();
		
		return answer.length == 0 ? new int[]{-1} : answer;
    }
}