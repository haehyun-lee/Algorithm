package ch03;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearch {
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
		public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();	//Comparator인터페이스를 구현한 클래스의 인스턴스를 '정적 클래스 상수'로 선언
		
		private static class HeightOrderComparator implements Comparator<PhysData> {			//제네릭 T를 PhysData타입으로 사용하는 Comparator인터페이스 구현
			public int compare(PhysData d1, PhysData d2) {										//객체 비교 동작을 구현하는 compare 메소드
				return (d1.height > d2.height) ? 1:
					   (d1.height < d2.height) ? -1 : 0;										//크면 양수, 작으면 음수, 같으면 0
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhysData[] x = {
				new PhysData("이나령", 162, 0.3),
				new PhysData("유지훈", 168, 0.4),
				new PhysData("김한결", 169, 1.5),
				new PhysData("홍준기", 171, 0.7),
				new PhysData("전서현", 173, 1.2),
				new PhysData("이호연", 174, 1.2),
				new PhysData("이수민", 175, 2.0),
		};
		
		System.out.print("몇 cm인 사람을 찾고 있나요?");
		int height = stdIn.nextInt();
		
		//검색 대상, 검색 값, 비교 기준 Comparator / Comparator 메서드 내에서 height값만 비교하게 작성해뒀기 때문에 다른 필드값 상관X
		int idx = Arrays.binarySearch(x, new PhysData("", height, 0.0), PhysData.HEIGHT_ORDER);

		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		}else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}
