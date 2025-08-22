import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        ArrayList<String> listaCompra = new ArrayList<>();

        listaCompra.add("Tomate");
        listaCompra.add("Picles");
        listaCompra.add("Carne");
        listaCompra.add("Maionese");
        listaCompra.add("Pao");

        imprimirLista(listaCompra);

        listaCompra.add(3, "Ketchup");
        listaCompra.set(2, "Linguica");

        imprimirLista(listaCompra);

        System.out.println("Contém Pipoca? " + possuiItem(listaCompra, "Pipoca"));
        System.out.println("Contém Tomate? " + possuiItem(listaCompra, "Tomate"));

        System.out.println("A Linguica está na posição " + listaCompra.indexOf("Linguica"));
        System.out.println(listaCompra.get(5) + " está na posição 5");

        System.out.println("-------------------------------");
        System.out.println("Procurar item: " + procurarItem(listaCompra, 5));

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        imprimirLista(numeros);
        System.out.println("Contém 20? " + possuiItem(numeros, 20));
    }

    public static <T> void imprimirLista(ArrayList<T> lista){
        for (T item : lista){
            System.out.println(item);
        }
        System.out.println("----------------");
    }

    public static <T> T procurarItem(ArrayList<T> lista, int posicao){
        if (posicao >= 0 && posicao < lista.size()) {
            return lista.get(posicao);
        }
        return null; // ou lançar uma exceção se preferir
    }

    public static <T> boolean possuiItem(ArrayList<T> lista, T item){
        for (T elemento : lista){
            if (Objects.equals(elemento, item)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean removerItem(ArrayList<T> lista, T item){
        return lista.remove(item);
    }

    public static <T> void limparLista(ArrayList<T> lista){
        lista.clear();
    }

    public static <T> void inverterLista(ArrayList<T> lista){
        for (int i = 0, j = lista.size() - 1; i < j; i++, j--) {
            T temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
        }
    }

    public static <T> void adicionarMultiplos(ArrayList<T> lista, T... itens){
        for (T item : itens) {
            lista.add(item);
        }
    }
}
