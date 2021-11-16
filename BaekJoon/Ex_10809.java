import java.util.Arrays;
import java.util.Scanner;

//알파벳 찾기 (문자열에서 알파벳 위치)
public class Ex_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] pos = new int[26];
		Arrays.fill(pos, -1);
		
		for(char ch : str.toCharArray()) {
			int idx = (int)ch - 'a';
			pos[idx] = str.indexOf(ch);
		}
		
		System.out.println(Arrays.toString(pos).replaceAll("[^0-9 \\-]", ""));
	}

}
