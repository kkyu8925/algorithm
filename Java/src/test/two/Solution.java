package test.two;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] needs, int r) {
        int answer = 0;
        List<String> needsList = new ArrayList<>();

        for (int i = 0; i < needs.length; i++) {
            String needsStr = "";

            for (int j = 0; j < needs[0].length; j++) {
                if (needs[i][j] == 1) {
                    needsStr += Integer.toString(j);
                }
            }
            needsList.add(needsStr);
        }

        for (String needsStr : needsList) {
            int cnt = 0;
            String tmp = needsStr;

            for (int i = 0; i < needsList.size(); i++) {
                String listStr = needsList.get(i);
                if (needsStr.equals(listStr) && needsStr.length() <= r) {
                    cnt++;
                } else if (tmp.length() > listStr.length() && tmp.startsWith(listStr)) {
                    cnt++;
                }
            }

            if (answer < cnt) {
                answer = cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] needs = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int r = 2;
        Solution s = new Solution();
        s.solution(needs, r);
    }
}
