package level1;

//내적 : 벡터를 수처럼 곱하는 것 = a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
public class InnerProduct {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i < a.length; i++){
            answer += (a[i] * b[i]);
        }
        
        return answer;
    }
}