package inflearn.section07.ex05_이진트리순회;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            // 전위 순회 : root - lt - rt
//            System.out.print(root.data + " ");
//            DFS(root.lt);
//            DFS(root.rt);

            // 중위 순회 : lt - root - rt
//            DFS(root.lt);
//            System.out.print(root.data + " ");
//            DFS(root.rt);

            // 후위 순회 : lt - rt - root
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
