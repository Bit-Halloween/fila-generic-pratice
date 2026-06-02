import java.util.ArrayList;

public class Fila<T> {
    private ArrayList<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public T proximo() {
        if (vazia()) {
            return null;
        }

        return itens.remove(0);
    }

    public T primeiro() {
        if (vazia()) {
            return null;
        }

        return itens.get(0);
    }

    public boolean vazia() {
        return itens.isEmpty();
    }

    public int quantidade() {
        return itens.size();
    }

    public void listar() {
        for (T item : itens) {
            IO.println(item);
        }
    }
}
