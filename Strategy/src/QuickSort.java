import java.util.List;

public class QuickSort implements Ordenar{

    @Override
    public String nombreMetodo() {
        return "QuickSort";
    }

    @Override
    public <T extends Comparable<T>> void ordenarLista(List<T> lista) {
        quickSortRecursive(lista, 0, lista.size() - 1);
    }

    private static <T extends Comparable<T>> void quickSortRecursive(List<T> lista, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(lista, low, high);
            quickSortRecursive(lista, low, pivotIndex - 1);
            quickSortRecursive(lista, pivotIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(List<T> lista, int low, int high) {
        T pivot = lista.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (lista.get(j).compareTo(pivot) < 0) {
                i++;
                // Intercambiar elementos
                T temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }
        // Intercambiar elementos
        T temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);
        return i + 1;
    }
}
