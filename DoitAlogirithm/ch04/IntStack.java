package ch04;

//int형 스택
public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	//사용자정의 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() { }
	}
	
	//사용자정의 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() { }
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//OverflowInstackException 예외가 발생할 수 있는 메서드
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) {
			throw new OverflowIntStackException();	//예외 던지기
		}
		return stk[ptr++] = x;
	}
}