package level1;

public class StringNullEmptyTest {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		String str3 = " ";
		
		System.out.println(isNullOrEmpty(str1));		//true
		System.out.println(isNullOrEmpty(str2));		//true
		System.out.println(isNullOrEmpty(str3));		//false
		
		System.out.println(isNullOrWhiteSpace(str1));	//true
		System.out.println(isNullOrWhiteSpace(str2));	//true
		System.out.println(isNullOrWhiteSpace(str3));	//true
	}
	
	static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}
	
	static boolean isNullOrWhiteSpace(String str) {
		return str == null || str.isEmpty() || str.contains(" ");
	}
}
