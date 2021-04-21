package lv2.오픈채팅방;


import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> rList = new ArrayList();
        HashMap<String, String> idMap = new HashMap();

        for (int i = 0; i < record.length; i++) {
            String[] command = record[i].split(" ");

            if (command[0].equals("Enter")) {
                rList.add(command[1] + "님이 들어왔습니다.");
                idMap.put(command[1], command[2]);
            } else if (command[0].equals("Change")) {
                idMap.put(command[1], command[2]);
            } else {
                rList.add(command[1] + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[rList.size()];

        for (int i = 0; i < rList.size(); i++) {
            int idx = rList.get(i).indexOf("님");
            String id = rList.get(i).substring(0, idx);
            String[] temp = rList.get(i).split(" ");
            answer[i] = idMap.get(id) + "님이 " + temp[1];
        }
        return answer;
    }
}