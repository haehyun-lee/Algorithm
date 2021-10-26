package level1;

//시저 암호
public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        
        String[] strArr = s.split("");
        
        for(int i = 0; i < strArr.length; i++){
            int idx = 0;
            if(upper.contains(strArr[i])){
                idx = upper.indexOf(strArr[i]) + n;
                answer += (idx >= upper.length()) ? upper.charAt(idx - upper.length()) : upper.charAt(idx); 
            }else if(lower.contains(strArr[i])){
                idx = lower.indexOf(strArr[i]) + n;
                answer += (idx >= lower.length()) ? lower.charAt(idx - lower.length()) : lower.charAt(idx);
            }else{
                answer += strArr[i];
            }
        }
        
        return answer;
    }
}
