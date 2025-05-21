package Exercicio4;

class No {
    int valor;
    No esquerda, direita;
}

public class EmOrdem {
    public static void emOrdem(No node) {
        if (node == null) return;
        emOrdem(node.esquerda);
        System.out.print(node.valor + " ");
        emOrdem(node.direita);
    }
}
