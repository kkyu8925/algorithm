package intern.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String code, String day, String[] data) {
        Map<String,String> rMap = new HashMap<>();

        for (String oneData : data) {
            String[] splitStr = oneData.split(" ");
            String dataPrice = splitStr[0];
            String dataCode = splitStr[1];
            String dataTime = splitStr[2];

            boolean codeCheck = dataCode.contains(code);
            boolean dayCheck = dataTime.contains(day);

            if (codeCheck && dayCheck) {
                rMap.put(dataTime,dataPrice);
            }
        }

        String[] keys = rMap.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        int[] answer = new int[keys.length];
        for(int i=0; i< keys.length; i++) {
            String value = rMap.get(keys[i]).replaceAll("[^0-9]","");
            answer[i] = Integer.parseInt(value);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String data[] = {"price=80 code=987654 time=2019062113", "price=90 code=012345 time=2019062014", "price=120 code=987654 time=2019062010", "price=110 code=012345 time=2019062009", "price=95 code=012345 time=2019062111"};
        s.solution("012345", "20190620", data);
    }
}
