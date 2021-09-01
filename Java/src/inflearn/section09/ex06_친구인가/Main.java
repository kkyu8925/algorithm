package inflearn.section09.ex06_친구인가;

import java.util.Scanner;

public class Main {
    static int[] UNF;

    private static int find(int idx) {
        // 인덱스와 인덱스의 배열값이 같을 때까지 순환
        if (idx == UNF[idx]) {
            return idx;
        } else {
            // 시간복잡도 해결 - 여러개의 자식 노드를 가진 트리로 압축
//            return find(UNF[idx]);
            return UNF[idx] = find(UNF[idx]);
        }
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            UNF[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 관계 수

        // 서로소 집합 init
        UNF = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            UNF[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        // 마지막 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a,b 는 친구인가?
        int fa = find(a);
        int fb = find(b);

        if (fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
