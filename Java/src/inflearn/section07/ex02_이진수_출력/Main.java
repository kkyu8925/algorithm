package inflearn.section07.ex02_이진수_출력;

public class Main {
    private void DFS(int i) {
        if (i < 2) {
            System.out.print(i);
        } else {
            DFS(i / 2);
            System.out.print(i % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}
