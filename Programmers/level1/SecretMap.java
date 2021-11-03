package level1;

//비밀 지도
public class SecretMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i < n; i++){
        	//두 배열의 요소를 OR연산 후 n자리 2진수화
            String row = String.format(String.format("%%%ds", n), Integer.toBinaryString(arr1[i] | arr2[i]));
            
            for(int j=0; j < n; j++){
            	//이진수 문자열에서 1은 #, 0은 공백으로 대체한 뒤 저장
            	answer[i] = row.replace('1', '#').replace('0', ' ');
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(5, arr1, arr2);
		
		System.out.println(String.join(", ", result));
	}
}