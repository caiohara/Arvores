package Ex_ContarNosComFIla;

public class Main {
    public static void main(String[] args) {
        No a = new No("A");
        No b = new No("B");
        No c = new No("C");
        No d = new No("D");
        No e = new No("E");
        No f = new No("F");

        a.esquerda = b;
        a.direita = c;
        b.esquerda = d;
        b.direita = e;
        c.direita = f;

        Arvore arvore = new Arvore();
        int totalNos = arvore.contarNosComFila(a);

        System.out.println("Total de nós: " + totalNos);  
    }
}

