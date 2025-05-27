package Exercicio6_sem_recursividade;

public class Main {
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);
        raiz.direita.esquerda = new No(6);
        raiz.direita.direita = new No(7);

        EmNivel em = new EmNivel();
        em.emNivel(raiz); 
    }
}
