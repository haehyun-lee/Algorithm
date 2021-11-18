import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//접미사 배열
public class Ex_11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] suffix = new String[str.length()];
		
		for(int i = 0; i < suffix.length; i++) {
			suffix[i] = str.substring(i);
		}
		
		Arrays.sort(suffix);
		System.out.println(String.join("\n", suffix));
	}

}
