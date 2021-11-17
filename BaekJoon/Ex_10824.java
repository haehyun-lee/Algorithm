import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//네 수
public class Ex_10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] nums = str.split(" ");
		
		long a = Long.parseLong(nums[0] + nums[1]);
		long b = Long.parseLong(nums[2] + nums[3]);
		
		System.out.println(a + b);
	}

}
