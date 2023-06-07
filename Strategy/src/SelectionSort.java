import java.util.List;

public class SelectionSort implements Ordenar{


    @Override
    public String nombreMetodo() {
        return "SelectionSort";
    }

    @Override
    public <T extends Comparable<T>> void ordenarLista(List<T> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j).compareTo(lista.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            T temp = lista.get(minIndex);
            lista.set(minIndex, lista.get(i));
            lista.set(i, temp);
        }
    }
}
