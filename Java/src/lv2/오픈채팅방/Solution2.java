package lv2.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public String[] solution(String[] records) {
        List<String> rList = new ArrayList<>();
        HashMap<String, String> idMap = new HashMap<>();
        idMap.put("enter", "들어왔습니다.");
        idMap.put("leave", "나갔습니다.");

        for (String record : records) {
            String[] splitArr = record.split(" ");
            String code = splitArr[0];
            String id = splitArr[1];
            if (splitArr.length > 2) {
                String name = splitArr[2];
                idMap.put(id, name);
            }
            if (!"Change".equalsIgnoreCase(code)) {
                rList.add(code + " " + id);
            }
        }

        String[] answer = new String[rList.size()];
        int i = 0;
        for (String record : rList) {
            String[] splitArr = record.split(" ");
            String name = idMap.get(splitArr[1]);
            answer[i++] = name + "님이 " + idMap.get(splitArr[0].toLowerCase());
        }

        return answer;
    }

}

