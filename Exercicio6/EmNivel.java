package Exercicio6;

import java.util.LinkedList;
import java.util.Queue;

class No {
    int valor;
    No esquerda, direita;
}

public class EmNivel {
    public void emNivel(No raiz) {
        if (raiz == null) return;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }
}