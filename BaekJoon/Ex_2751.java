import java.util.Arrays;
import java.util.Scanner;

//오름차순 정렬
public class Ex_2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
        Arrays.sort(nums);
        
		for(int i : nums) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}

}
