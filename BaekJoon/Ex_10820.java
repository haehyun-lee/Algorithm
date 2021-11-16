import java.util.Scanner;

//문자열 분석 (문자열에 포함된 소문자, 대문자, 숫자, 공백 개수)
public class Ex_10820 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		while(sc.hasNext()) {
			int lower = 0, upper = 0, num = 0, space = 0;
			String str = sc.nextLine();
			
			for(char ch : str.toCharArray()) {
				if(Character.isUpperCase(ch)) {
					upper++;
				}else if(Character.isLowerCase(ch)) {
					lower++;
				}else if(Character.isDigit(ch)) {
					num++;
				}else {
					space++;
				}
			}
			sb.append(String.format("%d %d %d %d\n", lower, upper, num, space));
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
