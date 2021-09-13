package programmers.탐욕법_greedy.lv2_구명보트;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int i = 0;

        for (int j = people.length - 1; i <= j; j--) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            answer++;
        }

        return answer;
    }
}