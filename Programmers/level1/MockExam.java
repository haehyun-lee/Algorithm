package level1;

import java.util.ArrayList;
import java.util.List;

//모의고사
public class MockExam {
	public int[] solution(int[] answers) {        
        //답안지
        int[] student1 = { 1, 2, 3, 4, 5 };
        int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] scores = new int[3];
        
        //채점
        for(int i = 0; i < answers.length; i++){
            int answer = answers[i];
            if(answer == student1[i % student1.length]){ scores[0]++; }
            if(answer == student2[i % student2.length]){ scores[1]++; }
            if(answer == student3[i % student3.length]){ scores[2]++; }
        }
        
        //최고 점수(가장 많이 맞힌 개수) 구하기
        int topScore = Math.max(Math.max(scores[0], scores[1]), scores[2]);
        
        //최고 점수인 수포자 구하기
        List<Integer> students = new ArrayList<>();
        for(int i=0; i < scores.length; i++){
            if(topScore == scores[i]){
                students.add(i+1);
            }
        }
        
        //리스트 → 배열 변환
        return students.stream().mapToInt(Integer::intValue).toArray();
    }
}
