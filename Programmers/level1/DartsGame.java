package level1;

//다트 게임
public class DartsGame {
	public static int solution(String dartResult) {
        int totalScore = 0;
        int[] scores = new int[3];              //3번의 기회 각 점수를 저장
        int turn = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                if(scores[turn] != 0) {         //해당 기회에 점수가 두번 저장되는 경우는 10뿐.
                    scores[turn] = 10; 
                }else{
                    scores[turn] = ch - '0';
                }
            }else{
                switch(ch){
                    case 'D':
                        scores[turn] = (int)(Math.pow(scores[turn], 2));
                        break;
                    case 'T':
                        scores[turn] = (int)(Math.pow(scores[turn], 3));
                        break;
                    case '*':
                        scores[turn] *= 2;
                        if(turn != 0) { scores[turn-1] *= 2; }  //1번째 기회에서는 현재 점수만 2배
                        break;
                    case '#':
                         scores[turn] *= -1;
                        break;
                }
                if(i == dartResult.length() -1){                //마지막 문자일 경우 .charAt(i+1) 하면 index넘어감
                    break;
                } else if(Character.isDigit(dartResult.charAt(i+1))){   //다음 문자가 숫자면 이번 기회는 끝인 것
                    turn++;
                }
            }
        }
        
        for(int score : scores){
            totalScore += score;
        }
        
        return totalScore;
    }

	public static void main(String[] args) {
		System.out.println(" => " + solution("1S2D*3T"));
		System.out.println(" => " + solution("1D2S#10S"));
		System.out.println(" => " + solution("1D2S0T"));
		System.out.println(" => " + solution("1S*2T*3S"));
		System.out.println(" => " + solution("1D#2S*3S"));
		System.out.println(" => " + solution("1T2D3D#"));
		System.out.println(" => " + solution("1D2S3T*"));
	}

}
