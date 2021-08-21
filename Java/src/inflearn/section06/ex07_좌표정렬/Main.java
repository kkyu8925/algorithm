package inflearn.section06.ex07_좌표정렬;

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 정렬기준은 먼저 x값의 의해서 오름차순, x값이 같을 경우 y값에 의해 오름차순
    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x, y);
        }
        Arrays.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
