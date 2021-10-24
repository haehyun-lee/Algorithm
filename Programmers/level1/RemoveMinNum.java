package level1;

//제일 작은 수 제거하기
public class RemoveMinNum {
    public int[] solution(int[] arr) {
    	//최소값을 제거하면 빈배열이 되는 경우
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        int[] answer = new int[arr.length-1];
        int minIdx = 0;							//최소값의 인덱스
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        
        for(int i = 0; i < answer.length; i++){	
            if(i < minIdx){
                answer[i] = arr[i];
            } else{
                answer[i] = arr[i+1];			//최소값 뒤의 값들 당기기
            }
        }
        
        return answer;
    }
}
