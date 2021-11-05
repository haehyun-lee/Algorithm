package level1;

//직사각형 좌표 구하기
public class Rectangle {
	public int[] solution(int[][] v) {
        int[] answer = new int[2];		//직사각형을 만들기 위해 남은 점의 x,y 좌표

        //좌표 값이 같은 것을 제외하고 혼자 남는 좌표값 구하기
        for(int i=0; i < answer.length; i++){
            if(v[0][i] == v[1][i]){
                answer[i] = v[2][i];
            }else if(v[0][i] == v[2][i]){
                answer[i] = v[1][i];
            }else{
                answer[i] = v[0][i];
            }
        }

        return answer;
    }
	
	public int[] solution2(int[][] v) {
        int[] answer = new int[2];

        answer[0] = v[0][0] ^ v[1][0] ^ v[2][0];
        answer[1] = v[0][1] ^ v[1][1] ^ v[2][1];

        return answer;
    }
	
}
