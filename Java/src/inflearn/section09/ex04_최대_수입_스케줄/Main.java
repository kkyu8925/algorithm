package inflearn.section09.ex04_최대_수입_스케줄;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int money;
    int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date; // 내림차순
    }
}

public class Main {
    static int N, MAX_DATE = 0;

    private int solution(List<Lecture> arr) {
        int answer = 0;
        Collections.sort(arr);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        // 마지막 날부터 할 수 있는 날짜 확인
        int j = 0;
        for (int i = MAX_DATE; i >= 1; i--) {
            for (; j < N; j++) {
                if (arr.get(j).date < i) {
                    break;
                } else {
                    pQ.offer(arr.get(j).money);
                }
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        List<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            arr.add(new Lecture(money, date));
            MAX_DATE = Math.max(MAX_DATE, date);
        }
        System.out.println(T.solution(arr));
    }
}
