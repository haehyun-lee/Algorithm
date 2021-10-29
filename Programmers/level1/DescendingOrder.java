package level1;

import java.util.Arrays;

//정수 내림차순으로 배치하기
public class DescendingOrder {
	public long solution1(long n) {
		String str = String.valueOf(n);
        char[] chArr = str.toCharArray();
        
        Arrays.sort(chArr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(chArr));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
	
	public long solution2(long n) {
		String str = String.valueOf(n);
        char[] chArr = str.toCharArray();
        
        for(int i=0; i < chArr.length; i++){
            for(int j=0; j < chArr.length-i-1; j++){
                if(chArr[j] < chArr[j+1]){
                    char ch = chArr[j];
                    chArr[j] = chArr[j+1];
                    chArr[j+1] = ch;
                }
            }
        }
        
        return new String(chArr);
	}
}
