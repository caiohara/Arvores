package Exercicio1_sem_recursividade;

public class Arvore {
    public No raiz;

    public Arvore() {
       
        No a = new No(1); 
        No b = new No(2);
        No c = new No(3);
        No d = new No(4);
        No e = new No(5);
        No f = new No(6);

        a.esquerda = b;
        a.direita = c;
        b.esquerda = d;
        b.direita = e;
        c.direita = f;

        raiz = a;
    }

    public void emOrdem() {
        java.util.Stack<No> pilha = new java.util.Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.esquerda;
            }

            atual = pilha.pop();
            System.out.print(atual.valor + " ");
            atual = atual.direita;
        }
    }
}

