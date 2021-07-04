package programmers.lv1.다트게임;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        Deque<Integer> score = new ArrayDeque<>();
        while (matcher.find()) {
            int tmp = Integer.parseInt(matcher.group(1));

            switch (matcher.group(2)) {
                case "D":
                    tmp *= tmp;
                    break;
                case "T":
                    tmp *= tmp * tmp;
            }

            switch (matcher.group(3)) {
                case "*":
                    if (!score.isEmpty()) {
                        score.push(score.pop() * 2);
                    }
                    tmp *= 2;
                    break;
                case "#":
                    tmp *= -1;
                    break;
            }
            score.push(tmp);
        }

        while (!score.isEmpty()) {
            answer += score.pop();
        }

        return answer;
    }
}
