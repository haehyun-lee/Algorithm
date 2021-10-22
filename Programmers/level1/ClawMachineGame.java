package level1;

import java.util.Stack;

//이차원 배열을 이용한 인형뽑기 게임
public class ClawMachineGame {
	/**
	 * 
	 * @param board	게임화면의 격자 상태 배열
	 * @param moves	크레인을 작동시킨 위치가 담긴 배열
	 * @return	크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수
	 */
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<Integer>();

        for(int i = 0; i < moves.length; i++){
            int move = moves[i]-1;

            for(int j = 0; j < board.length; j++){
                int doll = board[j][move];
                if(doll != 0){
                    if(!basket.empty() && basket.peek() == doll){
                        basket.pop();
                        answer += 2;
                    }else{
                        basket.push(doll);
                    }

                    board[j][move] = 0;

                    break;
                }
            }
        }

        return answer;
	}

	public static void main(String[] args) {
		int[][] board = {
				{0, 0, 0, 0, 0}, 
				{0, 0, 1, 0, 3}, 
				{0, 2, 5, 0, 1}, 
				{4, 2, 4, 4, 2}, 
				{3, 5, 1, 3, 1}
		};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		
		System.out.println("터진 인형의 개수 : " + solution(board, moves));
	}
}
