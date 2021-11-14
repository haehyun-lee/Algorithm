import java.util.Arrays;
import java.util.Scanner;

public class Ex_10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];			//알파벳은 26개
        
        for(char ch : str.toCharArray()){
            int idx = (int)ch - 'a';		//소문자에서 현재 문자의 순번
            count[idx]++;
        }
        
        String result = Arrays.toString(count);
        System.out.println(result.substring(1, result.length()-1).replace(",", ""));
	}

}
