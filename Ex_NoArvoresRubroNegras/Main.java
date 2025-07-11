package Ex_NoArvoresRubroNegras;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        int[] keys = {10, 20, 30, 15, 5, 25};
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println("Árvore após inserções (in-order):");
        tree.inorder();

        tree.delete(15);
        tree.delete(10);

        System.out.println("Árvore após remoções (in-order):");
        tree.inorder();
    }
}