package lv1.다트게임;

import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

//        Pattern pattern = Pattern.compile("([0-9+]([SDT])")

        int res = dartResult.indexOf("\\d+");
        System.out.println(res);

//        for (String once : dartResult.split("\\D[SDT]")) {
//            System.out.println(once);
//        }
        return answer;
    }

    public static void main(String[] args) {

        String a = "1D2S#10S";

        Solution s = new Solution();
        s.solution(a);

    }


}
