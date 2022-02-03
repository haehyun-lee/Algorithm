import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 서로 다른 나머지 개수 카운트
public class Ex_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();

        for(int i =0; i < 10; i++){
            int num = sc.nextInt();
            set.add(num % 42);
        }

        System.out.println(set.size());
    }
}
