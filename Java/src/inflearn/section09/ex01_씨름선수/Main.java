package inflearn.section09.ex01_씨름선수;

import java.util.*;

class Body implements Comparable<Body> {
    int height, weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}

public class Main {
    private int solution(List<Body> arr) {
        int answer = 0;
        Collections.sort(arr);
        int max = 0;
        for (Body body : arr) {
            if (body.weight > max) {
                answer++;
                max = body.weight;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr));
    }
}
