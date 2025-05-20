package Atividade3;

class No {
    int valor;
    No esquerda, direita;
}

class PreOrdem {
    public void preOrdem(No node) {
        if (node == null) return;
        System.out.print(node.valor + " ");
        preOrdem(node.esquerda);
        preOrdem(node.direita);
    }
}