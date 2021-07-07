package inflearn.section09.ex03_결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class Main {
    private int solution(List<Time> arr) {
        int answer = 0;
        Collections.sort(arr);
        int cnt = 0;
        for (Time time : arr) {
            if (time.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = sc.nextInt();
            arr.add(new Time(startTime, 's'));
            int endTime = sc.nextInt();
            arr.add(new Time(endTime, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
