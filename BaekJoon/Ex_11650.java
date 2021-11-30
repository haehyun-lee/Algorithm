import java.util.Arrays;
import java.util.Scanner;

//좌표 정렬하기
public class Ex_11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int N = sc.nextInt();
		int[][] pos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			 pos[i][0] = sc.nextInt();	//x
			 pos[i][1] = sc.nextInt();	//y
		}
		
		//int[][] 의 비교대상인 요소 o1, o2는 각각 int[] 타입
		Arrays.sort(pos, (o1, o2) ->{
			if(o1[0] == o2[0])
				return Integer.compare(o1[1], o2[1]);
			else
				return Integer.compare(o1[0], o2[0]);
		});
		
		for(int[] arr : pos) {
			sb.append(String.format("%d %d\n", arr[0], arr[1]));
		}
		
		System.out.println(sb);
	}

}
