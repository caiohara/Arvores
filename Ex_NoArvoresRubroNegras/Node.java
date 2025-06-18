package Ex_NoArvoresRubroNegras;

enum Color {
    RED, BLACK
}

public class Node {
    int key;
    Color color;
    Node left, right, parent;

    public Node(int key) {
        this.key = key;
        this.color = Color.RED;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}