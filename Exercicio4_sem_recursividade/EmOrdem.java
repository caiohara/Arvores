package Exercicio4_sem_recursividade;

import java.util.Stack;

public class EmOrdem {
    public static void emOrdem(No raiz) {
        Stack<No> pilha = new Stack<>();
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
