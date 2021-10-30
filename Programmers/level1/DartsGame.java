package level1;

//다트 게임
public class DartsGame {
	public static int solution(String dartResult) {
        int sum = 0;
        int[] scores = new int[3];
        int turn = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                if(scores[turn] != 0) { 
                    scores[turn] = 10; 
                }else{
                    scores[turn] = ch - '0';
                }
            }else if(Character.isAlphabetic(ch)){
                switch(ch){
                    case 'D':
                        scores[turn] = (int)(Math.pow(scores[turn], 2));
                        break;
                    case 'T':
                        scores[turn] = (int)(Math.pow(scores[turn], 3));
                        break;
                }
                if(i == dartResult.length() -1){
                    break;
                } else if(Character.isDigit(dartResult.charAt(i+1))){
                    turn++;
                }
            }else{
                switch(ch){
                    case '*':
                        scores[turn] *= 2;
                        if(turn != 0){ scores[turn-1] *= 2; }
                        break;
                    case '#':
                        scores[turn] *= -1;
                        break;
                }
                turn++;
            }
        }
        
        for(int score : scores){
            sum += score;
            System.out.print(score + ", ");
        }
        
        return sum;
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
