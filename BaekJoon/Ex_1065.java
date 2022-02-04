import java.util.Scanner;

// 한수 : 각 자리가 등차수열을 이루는 양의 정수
public class Ex_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= N; i++){
            if(isHansu(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    // 한수 체크
    static boolean isHansu(int n){
        if(n < 100) { return true; }

        int right = n % 10;         // 오른쪽 수
        n /= 10;
        int left = n % 10;          // 왼쪽 수
        n /= 10;
        int diff = right - left;    // 두 수의 차이 (절대값 아님, +- 구분 주의)

        while(n > 0){
            right = left;
            left = n % 10;
            n /= 10;

            if(diff != right - left){
                return false;
            }
        }
        return true;
    }
}
