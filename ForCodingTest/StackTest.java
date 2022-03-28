import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // First In Last Out 구조
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);  // 삭제
        stack.pop();
        stack.push(1);
        stack.push(4);  // 삭제
        stack.pop();

        // 스택의 최상단 원소부터 출력
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
