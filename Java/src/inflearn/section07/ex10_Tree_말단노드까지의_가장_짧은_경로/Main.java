package inflearn.section07.ex10_Tree_말단노드까지의_가장_짧은_경로;

import java.util.LinkedList;
import java.util.Queue;

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

    private int BFS(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int L = 0;

        while (!que.isEmpty()) {
            int len = que.size();
            for (int i = 0; i < len; i++) {
                Node current = que.poll();

                if (current.lt == null && current.rt == null) {
                    return L;
                }

                if (current.lt != null) que.offer(current.lt);
                if (current.rt != null) que.offer(current.rt);
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
