package level1;

//짝수와 홀수
public class EvenOdd {
	public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
}
