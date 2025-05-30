package Exercicio7;

public class Arvore {

    public int contarNosFolha(No no) {
        if (no == null) return 0;

        if (no.esquerda == null && no.direita == null) {
            return 1;
        }

        return contarNosFolha(no.esquerda) + contarNosFolha(no.direita);
    }
}
