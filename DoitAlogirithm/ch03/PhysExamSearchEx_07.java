package ch03;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearchEx_07 {
	static class PhysData{
		//Member
		private String name;
		private int height;
		private double vision;
		
		//Generator
		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//toString Overriding
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		//Comparator
		public static final Comparator<PhysData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhysData> {
			public int compare(PhysData d1, PhysData d2) {
				return (d1.vision > d2.vision) ? 1:
					   (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhysData[] x = {
				new PhysData("이나령", 162, 0.3),
				new PhysData("유지훈", 168, 0.4),
				new PhysData("김한결", 169, 0.5),
				new PhysData("홍준기", 171, 0.7),
				new PhysData("전서현", 173, 1.2),
				new PhysData("이호연", 174, 1.5),
				new PhysData("이수민", 175, 2.0),
		};
		
		System.out.print("시력이 몇인 사람을 찾고 있나요?");
		double vision = stdIn.nextDouble();
		
		//검색 대상, 검색 값, 비교 기준 Comparator
		int idx = Arrays.binarySearch(x, new PhysData("", 0, vision), PhysData.VISION_ORDER);

		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		}else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}
