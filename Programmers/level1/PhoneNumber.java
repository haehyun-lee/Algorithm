package level1;

//전화번호의 뒷 4자리를 제외한 나머지 숫자를 *로 가리기
public class PhoneNumber {
	public static String solution(String phone_number) {
		char[] chArr = phone_number.toCharArray();		//String -> Char[]
		
		for(int i=0; i < chArr.length-4; i++) {
			chArr[i] = '*';
		}
		
		return new String(chArr);						//Char[] -> String
	}
	
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
}