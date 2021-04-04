package lv2.JadenCase_문자열만들기;

import java.util.Locale;

class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        s = s.toLowerCase();

        for (String word : s.split(" ")) {
            for (int i = 0; i < word.length(); i++) {
                if (i == 0) {
                    answer += Character.toUpperCase(word.charAt(i));
                } else {
                    answer += word.charAt(i);
                }
            }
            answer += " ";
        }
        answer = answer.trim();

        // 테스트8번 공백이 있는 문자는 공백 포함
        while (answer.length() != len) {
            answer += " ";
        }
        return answer;
    }

}
