package level1;

//키패드 누르기
public class PressKeypad {
	public String solution(int[] numbers, String hand) {
		StringBuffer sb = new StringBuffer();

		int leftPos = 10; 		// *은 10으로 치환
		int rightPos = 12; 		// #은 12로 치환

		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {			//왼쪽 키패드
				sb.append("L");
				leftPos = number;
			} else if (number == 3 || number == 6 || number == 9) {		//오른쪽 키패드
				sb.append("R");
				rightPos = number;
			} else {													//가운데 키패드
				int leftDis = getDistance(leftPos, number);
				int rightDis = getDistance(rightPos, number);
				
				if(leftDis < rightDis) {
					sb.append("L");
					leftPos = number;
				}else if(leftDis > rightDis) {
					sb.append("R");
					rightPos = number;
				}else {
					if(hand.equals("right")) {
						sb.append("R");
						rightPos = number;
					}else {
						sb.append("L");
						leftPos = number;
					}
				}
			}
		}
		
		return sb.toString();		
	}
	
	//두 좌표 간 거리 반환
	public static int getDistance(int pos, int number) {
		// 0은 11로 치환
		pos = (pos == 0) ? 11 : pos;
		number = (number == 0) ? 11 : number;
		
		//좌,우측의 번호에서 좌표 값 추출
		int posX = (pos - 1) / 3;
		int posY = (pos - 1) % 3;
		//중앙 번호에서 좌표 값 추출 
		int numberX = number / 3;
		int numberY = 1;
		
		return Math.abs(posX - numberX) + Math.abs(posY - numberY);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
