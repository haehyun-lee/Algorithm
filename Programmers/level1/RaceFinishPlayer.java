package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

//완주하지 못한 선수
public class RaceFinishPlayer {
	//Hash
	public String solution(String[] participant, String[] completion) {
		String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
        	map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for(String player : completion) {
        	map.put(player, map.get(player) - 1);	//completion의 모든 요소는 participant에 무조건 있음
        }
        
        for(Entry<String, Integer> entry : map.entrySet()) {
        	if(entry.getValue().intValue() != 0) {
        		answer = entry.getKey();			//key가 선수이름, value는 사람 수
        		break;
        	}
        }
        
        return answer;
    }
	
	//Sort & Loop
	public String solution2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }
        
        return participant[i];
    }
	
	public static void main(String[] args) {
		String[] part = {};
		String[] comp = {};
		
		RaceFinishPlayer sol = new RaceFinishPlayer();
		System.out.println(sol.solution(part, comp));
	}
}
