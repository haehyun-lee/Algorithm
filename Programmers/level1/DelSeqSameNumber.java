package level1;

import java.util.ArrayList;
import java.util.List;

//같은 숫자는 싫어
public class DelSeqSameNumber {
	public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int preNum = 10;		//배열 arr의 원소는 무조건 0~9
        
        for(int i : arr){
            if(preNum != i){
                list.add(i);
                preNum = i;
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();	//List to Array
        //return list.stream().mapToInt(Integer::intValue).toArray();
    }
}