package level1;

public class CharCaseTest {

	public static void main(String[] args) {
		char ch = 'A';
				
		System.out.println(Character.isAlphabetic(ch));		//true
		System.out.println(Character.isUpperCase(ch));		//true
		System.out.println(Character.isLowerCase(ch));		//false
		
		ch = 'a';
		System.out.println(Character.isAlphabetic(ch));		//true
		System.out.println(Character.isUpperCase(ch));		//true
		System.out.println(Character.isLowerCase(ch));		//false
	}

}
