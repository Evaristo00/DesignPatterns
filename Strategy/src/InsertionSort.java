import java.util.List;

public class InsertionSort implements Ordenar{

    @Override
    public String nombreMetodo() {
        return "InsertionSort";
    }

    @Override
    public <T extends Comparable<T>> void ordenarLista(List<T> lista) {
        int n = lista.size();
        for (int i = 1; i < n; i++) {
            T key = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).compareTo(key) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, key);
        }
    }
}
