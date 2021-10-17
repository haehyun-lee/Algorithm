package ch02;
import java.util.Random;

//난수로 지정한 인원의 키 배열에서 키의 최대값 출력
public class MaxOfArrayRandEx_01 {
	//배열 요소 중 최대값 반환
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최대값을 구합니다.");
		int num = rand.nextInt(10)+1;			//사람 수 : 1~9
		System.out.println("사람 수 : "+num);
		
		int[] height = new int[num];
		
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);	//키 : 100~189
			System.out.println("height["+i+"] : "+height[i]);
		}
		
		System.out.println("최대값은 "+maxOf(height)+"cm 입니다.");
	}
}
