package test.one;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] gift_cards, int[] wants) {
        int answer = gift_cards.length;

        List<Integer> cardsList = new ArrayList<>();
        List<Integer> wantsList = new ArrayList<>();

        for (int i = 0; i < gift_cards.length; i++) {
            if (gift_cards[i] == wants[i]) {
                answer--;
            } else {
                cardsList.add(gift_cards[i]);
                wantsList.add(wants[i]);
            }
        }
//        System.out.println(cardsList);
//        System.out.println(wantsList);

        int listIndex = -1;
        for (int card : cardsList) {
            listIndex = wantsList.indexOf(card);
            if (listIndex >= 0) {
                wantsList.remove(listIndex);
                answer--;
            }
//            System.out.println(listIndex);
        }
//        System.out.println(wantsList);
//        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1};
        int[] b = {1, 1, 1, 1, 1};

        Solution s = new Solution();
        s.solution(a, b);

    }
}
