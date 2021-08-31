package inflearn.section09.ex02_회의실배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.end;
        } else {
            return this.end - o.end;
        }
    }
}

public class Main {
    private int solution(List<Time> arr) {
        int answer = 0;
        Collections.sort(arr);
        int endTime = 0;
        for (Time time : arr) {
            if (time.start >= endTime) {
                answer++;
                endTime = time.end;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Time(start, end));
        }
        System.out.println(T.solution(arr));
    }
}
