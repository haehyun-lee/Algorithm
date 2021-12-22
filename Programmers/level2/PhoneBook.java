package level2;

import java.util.HashMap;

// 전화번호 목록 (해시)
public class PhoneBook {
    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String phone_number : phone_book) {
            map.put(phone_number, 1);
        }

        for (String phone_number : phone_book) {
            for (int j = 1; j < phone_number.length(); j++) {
                String prefix = phone_number.substring(0, j);
                if(map.containsKey(prefix))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
}