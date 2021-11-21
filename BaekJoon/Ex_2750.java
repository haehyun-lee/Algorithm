import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//오름차순 정렬
public class Ex_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		//배열 저장
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		//배열 정렬
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

}
