package Exercicio2_sem_recursividade;

public class Main {
    public static void main(String[] args) {
        No raiz = new No();
        raiz.esquerda = new No();
        raiz.direita = new No();
        raiz.esquerda.esquerda = new No();
        raiz.direita.direita = new No();

        int total = Contador.contarNos(raiz);
        System.out.println("Total de nós: " + total);
    }
}

