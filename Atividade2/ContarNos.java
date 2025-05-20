package Atividade2;

class No {
    No esquerda, direita;
}

public class ContarNos {
    public static int contarNos(No node) {
        if (node == null) return 0;
        return 1 + contarNos(node.esquerda) + contarNos(node.direita);
    }
}