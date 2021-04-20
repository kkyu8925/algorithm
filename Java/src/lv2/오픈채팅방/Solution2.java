package lv2.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public String[] solution(String[] records) {
        HashMap<String, String> codeMap = new HashMap<>();
        codeMap.put("enter", "들어왔습니다.");
        codeMap.put("leave", "나갔습니다.");

        HashMap<String, String> idMap = new HashMap<>();
        List<String> rList = new ArrayList<>();

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
        for (int i = 0; i < answer.length; i++) {
            String[] splitArr = rList.get(i).split(" ");
            String name = idMap.get(splitArr[1]);
            answer[i] = name + "님이 " + codeMap.get(splitArr[0].toLowerCase());
        }

        return answer;
    }
}

