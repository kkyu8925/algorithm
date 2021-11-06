package woo.ex6;

public class Solution {
    public String solution(double time, String[][] plans) {
        String answer = "";
        double startMonday = 13;
        double endMonday = 18;
        double startFriday = 9.5;
        double endFriday = 18;

        for (String[] plan : plans) {
            String arrive = plan[0];
            String startStr = plan[1];
            String endStr = plan[2];

            int startTime = 0;
            int endTime = 0;

            startTime = getTime(startStr, startTime);
            endTime = getTime(endStr, endTime);

            double needTime = 0;
            if (startTime >= startFriday && startTime <= endFriday) {
                needTime += endFriday - startTime;
            } else if (startTime < startFriday) {
                needTime += endFriday - startFriday;
            }

            if (endTime >= startMonday && endTime <= endMonday) {
                needTime += endTime - startMonday;
            } else if (endTime > endMonday) {
                needTime += endMonday - startMonday;
            }

            if (needTime <= time) {
                return arrive;
            }
        }
        return answer;
    }

    private int getTime(String str, int time) {
        String type = str.substring(str.length() - 2);
        if (type.equals("PM")) {
            str = str.replace("PM", "");
            time = 12 + Integer.parseInt(str);
        } else {
            str = str.replace("AM", "");
            time += Integer.parseInt(str);
        }
        return time;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        double time = 3.5;
        String[][] plans = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
        System.out.println(T.solution(time, plans));
    }
}
