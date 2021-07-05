package inflearn.section03.ex02_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int ap = 0;
        int bp = 0;

        while (ap < n && bp < m) {
            if (a[ap] == b[bp]) {
                answer.add(a[ap++]);
                bp++;
            }
            else if (a[ap] < b[bp]) ap++;
            else if (a[ap] > b[bp]) bp++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
