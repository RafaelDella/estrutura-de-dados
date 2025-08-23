package lista_encadeada;

public class ListaLineares {
    public static void main(String[] args) {
        MinhaLista<String> listaCompra = new MinhaLista<>();

        listaCompra.add("Tomate");
        listaCompra.add("Picles");
        listaCompra.add("Carne");
        listaCompra.add("Maionese");
        listaCompra.add("Pao");

        listaCompra.print();

        listaCompra.add(3, "Ketchup");
        listaCompra.set(2, "Linguica");

        listaCompra.print();

        System.out.println("Contém Pipoca? " + listaCompra.contains("Pipoca"));
        System.out.println("Contém Tomate? " + listaCompra.contains("Tomate"));

        System.out.println("A Linguica está na posição " + listaCompra.indexOf("Linguica"));
        System.out.println(listaCompra.get(5) + " está na posição 5");

        System.out.println("-------------------------------");
        System.out.println("Procurar item na posição 5: " + listaCompra.get(5));

        MinhaLista<Integer> numeros = new MinhaLista<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.print();

        System.out.println("Contém 20? " + numeros.contains(20));
    }
}
