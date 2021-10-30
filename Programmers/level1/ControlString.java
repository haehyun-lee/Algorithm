package level1;

//문자열 다루기
public class ControlString {
	//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인
	public boolean solution(String s) {
        if((s.length() == 4 || s.length() == 6) && s.replaceAll("[^0-9]", "") == s){
            return true;
        }else{
            return false;
        }
    }
	
	//정규식
	public boolean solution2(String s) {
		return s.matches("^[0-9]{4}|{6}$");
	}
}