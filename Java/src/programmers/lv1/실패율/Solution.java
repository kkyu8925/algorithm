package programmers.lv1.실패율;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {

        int[] stay = new int[N + 2];

        for (int stage : stages) {
            stay[stage] += 1;
        }

        int players = stages.length;
        List<Stage> rList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failure = (double) stay[i] / players;
            players -= stay[i];

            Stage s = new Stage(i, failure);
            rList.add(s);
        }
        Collections.sort(rList);

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = rList.get(i).no;
        }

        return answer;

    }

    class Stage implements Comparable<Stage> {
        public int no;
        public double failure;

        public Stage(int no, double failure) {
            this.no = no;
            this.failure = failure;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure > o.failure) {
                return -1;
            }
            if (failure < o.failure) {
                return 1;
            }
            return 0;
        }
    }
}