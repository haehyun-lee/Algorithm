package level2;

import java.util.HashSet;
import java.util.Iterator;

//소수 찾기 (완전탐색)
public class FindPrime {
	HashSet<Integer> numbersSet = new HashSet<>();	//숫자 조합(중복x)
	
	//소수 판별
	public boolean isPrime(int num) {
		if(num == 0 || num ==1)
			return false;
		
		int lim = (int)Math.sqrt(num);
		
		for(int i = 2; i <= lim; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//모든 조합의 숫자 만들기
	public void recursive(String comb, String others) {
		//자릿수 상관없이 현재 숫자 조합 넣기
		if(!comb.equals("")) {
			numbersSet.add(Integer.parseInt(comb));
		}
		
		//others에서 i번째 수를 시작값으로 하는 여러 조합 만들기 
		for(int i = 0; i < others.length(); i++) {
			recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
		}
	}
	
	public int solution(String numbers) {
        recursive("", numbers);
		
		//소수의 개수만 카운트
		int count = 0;
		Iterator<Integer> it = numbersSet.iterator();
		while(it.hasNext()) {
			int number = it.next();
			if(isPrime(number)) {
				count++;
			}
		}
        
		//소수 개수 반환
        return count;
    }
	
	
}
