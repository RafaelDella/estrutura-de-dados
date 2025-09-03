package lista_encadeada;
import java.util.Scanner;

class MinhaColuna{

    private int capacidade;
    private int topo = 0;
    private int[] pilha;
    public MinhaColuna(int capacidade){
        this.capacidade = capacidade;
        pilha = new int[this.capacidade];
    }

    public boolean insere(int elemento)
    {
        pilha[topo] = elemento;
        topo++;
        System.out.println("Elemento inserido com sucesso");
        return true;
    }

    public boolean remove(){
        if(vazia() == false)
        {
            topo--;
            System.out.println("Elemeneto removido");
            return true;
        }
        System.out.println("Nao ha elementos para remover");
        return false;
    }

    public boolean vazia()
    {
        if(topo == 0) return true;
        return false;
    }

    public boolean cheia()
    {
        if (topo == capacidade) return true;
        return false;
    }
    public void imprime()
    {
        if(vazia()) return;
        int range = topo;

        for(int i = 0; i < range; i++)
        {
            System.out.println("Posicao : " + i + " / Dado :" + pilha[i]);
        }
    }
}
public class pilha{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade do vetor");
        int capacidade = scanner.nextInt();

        Estrutura pilha = new Estrutura(capacidade);

        int controller;
        while(true)
        {
            System.out.println(
                    "\nDigite uma opcao.\n"+
                            "1 - Inserir\n"+
                            "2 - Cheia\n"+
                            "3 - Vazia\n"+
                            "4 - Remove\n" +
                            "5 - Imprime"
            );
            controller = scanner.nextInt();
            if(controller < 1 || controller > 5) return;

            switch (controller) {
                case 1:
                    if(pilha.cheia()) continue;

                    System.out.println("Digite o numero a ser inserido:");
                    controller = scanner.nextInt();
                    pilha.insere(controller);
                    break;
                case 2:
                    System.out.println("A lista esta cheia?: " + pilha.cheia());
                    break;

                case 3:
                    System.out.println("A lista esta vazia?: " + pilha.vazia());
                    break;

                case 4:
                    System.out.println("Elemento removido com sucesso?: " + pilha.remove());
                    break;
                case 5:
                    pilha.imprime();
                default:
                    break;
            }
        }
    }

}