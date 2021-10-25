package level1;

import java.lang.Math;

//정수 제곱근 판별
public class SquareRoot {
	public long solution(long n) { 
		if(Math.pow((int)Math.sqrt(n), 2) == n){ 
			return (long)Math.pow(Math.sqrt(n) + 1, 2); 
		} 
		
		return -1;
	}
}