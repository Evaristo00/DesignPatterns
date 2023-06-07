import java.util.ArrayList;

public class Context {

    private Ordenar estategia;

    public void setEstategia(Ordenar estategia) {
        this.estategia = estategia;
    }

    public void executeStrategy(ArrayList<Integer> arrayList){
        this.estategia.ordenarLista(arrayList);
    }
}
