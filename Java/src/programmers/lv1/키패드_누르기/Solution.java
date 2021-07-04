package programmers.lv1.키패드_누르기;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lhand = 10;
        int rhand = 12;


        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                lhand = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rhand = num;
            } else {

                int lDistance = getDis(lhand, num);
                int rDistance = getDis(rhand, num);

                if (lDistance > rDistance) {
                    answer += "R";
                    rhand = num;
                } else if (lDistance < rDistance) {
                    answer += "L";
                    lhand = num;

                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rhand = num;
                    } else {
                        answer += "L";
                        lhand = num;
                    }
                }

            }
        }
        return answer;
    }

    public static int getDis(int handlocation, int num) {

        if (num == 0) {
            num = 11;
        }

        if (handlocation == 0) {
            handlocation = 11;
        }

        int locationX = (handlocation - 1) / 3;
        int locationY = (handlocation - 1) % 3;

        int numberX = (num - 1) / 3;
        int numberY = 1;

        return Math.abs(locationX - numberX) + Math.abs(locationY - numberY);

    }
}
