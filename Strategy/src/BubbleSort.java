import java.util.List;

public class BubbleSort implements Ordenar{

    @Override
    public String nombreMetodo() {
        return "BubbleSort";
    }

    @Override
    public <T extends Comparable<T>> void ordenarLista(List<T> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    // Intercambiar elementos
                    T temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
}
