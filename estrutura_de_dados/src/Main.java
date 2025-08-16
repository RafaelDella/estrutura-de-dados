import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        ArrayList lista_compra = new ArrayList<String>();

        lista_compra .add("Tomate");
        lista_compra .add("Picles");
        lista_compra .add("Carne");
        lista_compra .add("Maionese");
        lista_compra .add("Pao");

        ImprimirLista(lista_compra);

        lista_compra.add(3, "Ketchup");
        lista_compra.set(2, "Linguica");

        ImprimirLista(lista_compra);

        System.out.println("Contem Pipoca? " + PossuiItemLista(lista_compra, "Pipoca"));
        System.out.println("Contem Tomate? " + PossuiItemLista(lista_compra, "Tomate"));

        System.out.println("A Linguica está na posicao " + lista_compra.indexOf("Linguica"));
        System.out.println(lista_compra.get(5) + " esta na posicao 5");

        System.out.println("-------------------------------");
        System.out.println("Procurar item: " + ProcurarItem(lista_compra, 5));

    }

    public static void ImprimirLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("----------------");
    }

    public static String ProcurarItem(ArrayList<String> lista, int posicao){
        for (int i = 0; i < lista.size(); i++){
            if(i == posicao){
                return lista.get(i);
            }
        }
        return "Error";
    }

    public static boolean PossuiItemLista(ArrayList<String> list, String palavra){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) == palavra){
                return true;
            }
        }

        return false;
    }

}