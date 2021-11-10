package level1;

import java.util.Set;
import java.util.TreeSet;

//포켓몬
public class Pokemon {
	 public int solution(int[] nums) {        
        Set<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        return Math.min(set.size(), nums.length / 2);
    }
}