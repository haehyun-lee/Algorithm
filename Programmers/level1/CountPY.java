package level1;

//문자열 내의 p와 y의 개수
public class CountPY {
	//forEach문
	static boolean solution(String s) {
        int cnt = 0;

        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if(ch == 'p'){
                cnt++;
            }else if(ch == 'y'){
                cnt--;
            }
        }

        return cnt == 0 ? true : false; 
    }
	
	//Stream
	boolean solution2(String s) {
		s = s.toLowerCase();
		
		return s.chars().filter(e -> e == 'p').count() == s.chars().filter(e -> e == 'y').count();
	}
	
	public static void main(String[] args) {
		System.out.println(solution("pyoopy"));
		System.out.println(solution("pooopy"));
		System.out.println(solution("ooog"));
	}
}
