package woo.ex2;

public class Solution {
    public String solution(String[] log) {
        String answer = "";
        int min = 0;

        for (int i = 0; i < log.length; i = i + 2) {
            String[] startLog = log[i].split(":");
            String[] stopLog = log[i + 1].split(":");

            int startHours = Integer.parseInt(startLog[0]);
            int startMin = Integer.parseInt(startLog[1]);
            int stopHours = Integer.parseInt(stopLog[0]);
            int stopMin = Integer.parseInt(stopLog[1]);

            if (startHours == stopHours) {
                int resMin = stopMin - startMin;
                if (resMin >= 5) {
                    min += resMin;
                }
            } else {
                int resHours = stopHours - startHours - 1;
                int resMin = 60 - startMin + stopMin;

                int amountMin = (resHours * 60) + resMin;
                if (amountMin >= 105) {
                    min += 105;
                } else if (amountMin >= 5) {
                    min += amountMin;
                }
            }
        }

        int resHours = min / 60;
        int resMin = min % 60;

        if (resHours < 10) {
            answer += "0" + resHours;
        } else {
            answer += resHours;
        }

        answer += ":";

        if (resMin < 10) {
            answer += "0" + resMin;
        } else {
            answer += resMin;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] log = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        String[] log2 = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};
        System.out.println(T.solution(log));
    }
}
