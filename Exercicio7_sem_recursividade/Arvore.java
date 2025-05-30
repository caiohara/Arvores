package Exercicio7_sem_recursividade;

import java.util.Stack;

public class Arvore {

    public int contarNosFolhaComPilha(No raiz) {
        if (raiz == null) return 0;

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        int contador = 0;

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();

            if (atual.esquerda == null && atual.direita == null) {
                contador++;
            }

            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }

        return contador;
    }
}
