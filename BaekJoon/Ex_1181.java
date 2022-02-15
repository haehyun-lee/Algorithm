import java.util.*;

// 단어 정렬
public class Ex_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(sc.nextLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        // 정렬 1. 단어 길이 오름차순, 2. 단어 사전순 오름차순
        Arrays.sort(arr, ((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        }));

        // 중복 제외 출력
        sb.append(arr[0] + "\n");
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i] + "\n");
            }
        }

        System.out.println(sb);
    }
}
