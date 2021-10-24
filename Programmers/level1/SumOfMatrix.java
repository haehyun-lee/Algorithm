package level1;

//행렬의 덧셈
public class SumOfMatrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        //int[][] answer = arr1 으로 하면 실제 arr1을 가리키게 되어 arr1의 값까지 변경됨
        
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
