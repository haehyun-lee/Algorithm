package level2;

import java.util.Arrays;

// H-Index (정렬)
public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;   // 논문 개수

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        H_Index h_index = new H_Index();
        System.out.println(h_index.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
