package inflearn.section07.ex01_재귀함수;

public class Main {
    private void DFS(int i) {
        if (i == 0) {
            return;
        } else {
            DFS(i - 1);
            System.out.print(i + " ");

//            System.out.print(i + " ");
//            DFS(i - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(10);
    }
}
