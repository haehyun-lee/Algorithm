import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[][] pos = { {3, 4}, {1, 1}, {1, -1}, {2, 2}, {3, 3} };
		
		Arrays.sort(pos, (o1, o2) -> {
			if(o1[0] == o2[0])
				return Integer.compare(o1[1], o2[1]);
			else
				return Integer.compare(o1[0], o2[1]);
		});
		
		for(int[] arr : pos) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
