import java.util.Scanner;

//ROT13
public class Ex_11655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				char tmp = (ch + 13 > 'Z') ? (char)(ch - 13) : (char)(ch + 13); 
				sb.append(tmp);
			}else if(Character.isLowerCase(ch)) {
				char tmp = (ch + 13 > 'z') ? (char)(ch - 13) : (char)(ch + 13); 
				sb.append(tmp);
			}else {
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
	}

}
