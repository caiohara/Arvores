package Ex_ArvoresAVL;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        // Inserindo valores
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(10); // Rotação
        arvore.inserir(25);

        System.out.print("Em ordem: ");
        arvore.imprimirInOrdem();

        // Busca
        System.out.println("Buscar 25: " + arvore.buscar(25)); 
        System.out.println("Buscar 50: " + arvore.buscar(50));

        // Remoção
        arvore.remover(20);
        System.out.print("Após remover 20: ");
        arvore.imprimirInOrdem();
    }
}
