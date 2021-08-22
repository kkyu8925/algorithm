package grab.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        List<Boolean> rList = new ArrayList<>();

        boolean userLogin = false;
        boolean userAdd = false;

        Map<String, String> userMap = new HashMap<>();
        for (String info : infos) {
            String[] strArr = info.split(" ");
            String userName = strArr[0];
            String pwd = strArr[1];

            userMap.put(userName, pwd);
        }

        for (String action : actions) {
            String[] strArr = action.split(" ");
            String command = strArr[0];

            switch (command) {
                case "LOGIN":
                    String userName = strArr[1];
                    String pwd = strArr[2];

                    if(!userMap.containsKey(userName)) {
                        rList.add(false);
                        break;
                    }

                    if (userMap.get(userName).equals(pwd) && !userLogin) {
                        userLogin = true;
                        rList.add(true);
                    } else {
                        rList.add(false);
                    }
                    break;
                case "ADD":
                    if (userLogin) {
                        userAdd = true;
                        rList.add(true);
                    } else {
                        rList.add(false);
                    }
                    break;
                case "ORDER":
                    if (userAdd) {
                        rList.add(true);
                        userAdd = false;
                    } else {
                        rList.add(false);
                    }
                    break;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = rList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] infos = {"kim password", "lee abc"};
        String[] actions = {"ADD 30",
                "LOGIN kim abc",
                "LOGIN test password",
                "LOGIN kim password",
                "LOGIN kim password",
                "LOGIN lee abc",
                "ADD 30",
                "ORDER",
                "ORDER",
                "ADD 40",
                "ADD 50"};
        T.solution(infos, actions);
    }
}
