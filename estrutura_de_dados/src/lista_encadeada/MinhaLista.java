package lista_encadeada;

import java.util.Objects;

public class MinhaLista<T> {
    private Object[] elementos;
    private int tamanho;

    public MinhaLista() {
        this.elementos = new Object[10]; // capacidade inicial
        this.tamanho = 0;
    }

    // Aumenta o tamanho do array quando necessário
    private void garantirCapacidade() {
        if (tamanho == elementos.length) {
            Object[] novoArray = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            elementos = novoArray;
        }
    }

    public void add(T item) {
        garantirCapacidade();
        elementos[tamanho++] = item;
    }

    public void add(int index, T item) {
        if (index < 0 || index > tamanho) throw new IndexOutOfBoundsException();
        garantirCapacidade();
        for (int i = tamanho; i > index; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[index] = item;
        tamanho++;
    }

    public void set(int index, T item) {
        if (index < 0 || index >= tamanho) throw new IndexOutOfBoundsException();
        elementos[index] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= tamanho) throw new IndexOutOfBoundsException();
        return (T) elementos[index];
    }

    public int indexOf(T item) {
        for (int i = 0; i < tamanho; i++) {
            if (Objects.equals(elementos[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public boolean remove(T item) {
        int index = indexOf(item);
        if (index == -1) return false;

        for (int i = index; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return true;
    }

    public void clear() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public void print() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
        System.out.println("-------------");
    }

    public void invert() {
        for (int i = 0, j = tamanho - 1; i < j; i++, j--) {
            Object temp = elementos[i];
            elementos[i] = elementos[j];
            elementos[j] = temp;
        }
    }

    @SafeVarargs
    public final void adicionarMultiplos(T... itens) {
        for (T item : itens) {
            add(item);
        }
    }
}
