import java.util.Scanner;

// 순차 탐색
public class SequentialSearch {
    /*
    순차탐색
    데이터 정렬 여부와 상관없이 가장 앞에 있는 원소부터 하나씩 순차적으로 확인한다.
    최악의 경우 시간 복잡도 : O(N) = 최대 N회 비교 
     */
    public static int sequentialSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        int n = sc.nextInt();
        String target = sc.next();

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        int targetPos = sequentialSearch(array, target);
        if (targetPos == -1) {
            System.out.println("해당 문자열은 존재하지 않습니다.");
        } else {
            System.out.printf("%s는(은) %d 번째에 있습니다.", target, targetPos);
        }
    }
}
