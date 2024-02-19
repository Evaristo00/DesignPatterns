import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.addAll(List.of(1,2,34,65,775,23,56,2,453,12,342,757,32,46,86,79,3,6835,57,2,34,56));
        ArrayList<Integer> lAditional = new ArrayList<Integer>(l);
        System.out.println(lAditional.toString());

        Context context = new Context();

        List<Ordenar> metodos = List.of(new BubbleSort(),new InsertionSort(),new SelectionSort(),new QuickSort());

        for (Ordenar metodo: metodos) {
            System.out.println("El metodo " + metodo.nombreMetodo() + " tardo: " + caluloTiempoDeEjecucion(context,lAditional, metodo));
            lAditional.clear();
            lAditional.addAll(l);
        }
    }

    public static long caluloTiempoDeEjecucion(Context context, ArrayList<Integer> lAditional, Ordenar metodo){
        context.setEstategia(metodo);
        long startTime = System.nanoTime();
        context.executeStrategy(lAditional);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
