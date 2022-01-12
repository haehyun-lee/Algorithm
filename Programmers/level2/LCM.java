package level2;

// N개의 최소공배수
public class LCM {
    public int solution(int[] arr) {
        int[] lcm = new int[arr.length];
        lcm[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int a = lcm[i - 1];
            int b = arr[i];
            int gcd = gcd(a, b);

            lcm[i] = (a * b / gcd);
        }

        return lcm[lcm.length - 1];
    }

    // 최대 공약수
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            // gcd(a, b) == gcd(b, r), 나머지 값 r을 b로 지정
            a = b;
            b = r;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        LCM lcm = new LCM();
        System.out.println(lcm.solution(arr));
    }
}
