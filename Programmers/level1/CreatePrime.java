package level1;

//소수 만들기
public class CreatePrime {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;				//소수 개수
	        
	        //서로 다른 세 개의 수 선택
	        for(int i = 0; i < nums.length - 2; i++){
	            for(int j = i + 1; j < nums.length - 1; j++){
	                for(int k = j + 1; k < nums.length; k++){
	                    int sum = nums[i] + nums[j] + nums[k];	//세 개의 수 합
	                    if(isPrime(sum)){
	                        answer++;
	                    }
	                }
	            }
	        }
	        
	        return answer;
	    }
	    
	    //소수 판별
	    public boolean isPrime(int num){
	        for(int i = 2; i <= Math.sqrt(num); i++){
	            if(num % i == 0){
	                return false;
	            }
	        }
	            
	        return true;
	    }
	}
}
