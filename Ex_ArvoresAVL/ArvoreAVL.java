package Ex_ArvoresAVL;

public class ArvoreAVL {
    private No raiz;

    // Inserção na árvore AVL
    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor) {
        if (no == null)
            return new No(valor);

        // Inserção normal em árvore binária
        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        } else {
            return no; // valor duplicado, não insere
        }

        // Atualiza altura do nó
        atualizarAltura(no);

        // Rebalanceia o nó, se necessário
        return balancear(no);
    }

    // Remoção na árvore AVL
    public void remover(int valor) {
        raiz = remover(raiz, valor);
    }

    private No remover(No no, int valor) {
        if (no == null) return null;

        // Busca do valor a remover
        if (valor < no.valor) {
            no.esquerda = remover(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = remover(no.direita, valor);
        } else {
            // Caso 1: nó sem filhos ou um filho
            if (no.esquerda == null) return no.direita;
            if (no.direita == null) return no.esquerda;

            // Caso 2: nó com dois filhos - pega o menor da subárvore direita
            No sucessor = menorNo(no.direita);
            no.valor = sucessor.valor;
            no.direita = remover(no.direita, sucessor.valor);
        }

        // Atualiza altura do nó e rebalanceia
        atualizarAltura(no);
        return balancear(no);
    }

    // Busca valor na árvore
    public boolean buscar(int valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(No no, int valor) {
        if (no == null) return false;
        if (valor == no.valor) return true;
        return valor < no.valor ? buscar(no.esquerda, valor) : buscar(no.direita, valor);
    }

    // Função auxiliar: retorna o menor nó de uma subárvore
    private No menorNo(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    // Atualiza a altura de um nó
    private void atualizarAltura(No no) {
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
    }

    // Retorna a altura de um nó
    private int altura(No no) {
        return (no == null) ? 0 : no.altura;
    }

    // Calcula o fator de balanceamento
    private int fatorBalanceamento(No no) {
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }

    // Rebalanceia o nó se necessário
    private No balancear(No no) {
        int fb = fatorBalanceamento(no);

        // Caso LL ou LR
        if (fb > 1) {
            if (fatorBalanceamento(no.esquerda) < 0) {
                no.esquerda = rotacaoEsquerda(no.esquerda); // caso LR
            }
            return rotacaoDireita(no); // caso LL ou após LR
        }

        // Caso RR ou RL
        if (fb < -1) {
            if (fatorBalanceamento(no.direita) > 0) {
                no.direita = rotacaoDireita(no.direita); // caso RL
            }
            return rotacaoEsquerda(no); // caso RR ou após RL
        }

        return no; // não precisa rebalancear
    }

    // Rotação simples à direita (LL)
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        // Rotação
        x.direita = y;
        y.esquerda = T2;

        // Atualiza alturas
        atualizarAltura(y);
        atualizarAltura(x);

        return x;
    }

    // Rotação simples à esquerda (RR)
    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        // Rotação
        y.esquerda = x;
        x.direita = T2;

        // Atualiza alturas
        atualizarAltura(x);
        atualizarAltura(y);

        return y;
    }

    // Impressão da árvore (em ordem)
    public void imprimirInOrdem() {
        inOrdem(raiz);
        System.out.println();
    }

    private void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            inOrdem(no.direita);
        }
    }
}

