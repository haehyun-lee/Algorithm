import java.util.Arrays;
import java.util.Scanner;

/*
일곱 난쟁이
일곱 난쟁이의 키의 합이 100일 때, 9명의 난쟁이에서 진짜 난쟁이 7명을 찾아내기.
 */
public class Ex_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = new int[9];
        int sum = 0;
        int spyA = 0, spyB = 0;

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
            sum += height[i];   // 9명 키의 합
        }

        Arrays.sort(height);    // 오름차순 정렬

        // 9명 키 합에서 랜덤하게 난쟁이 2명의 키를 뺐을 때 100일 경우 그 둘이 스파이.
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (i != j) {
                    if (sum - (height[i] + height[j]) == 100) {
                        spyA = i;
                        spyB = j;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < height.length; i++) {
            if (i != spyA && i != spyB) {
                System.out.println(height[i]);
            }
        }
        sc.close();
    }
}
