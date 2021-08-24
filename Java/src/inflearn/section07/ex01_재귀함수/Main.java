package inflearn.section07.ex01_재귀함수;

public class Main {
    private void DFS(int i) {
        if (i == 0) return;
        else {
            // 출력 - 1 2 3 4 5 6 7 8 9 10
//            DFS(i - 1);
//            System.out.print(i + " ");

            // 출력 - 10 9 8 7 6 5 4 3 2 1
//            System.out.print(i + " ");
//            DFS(i - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(10);
    }
}
