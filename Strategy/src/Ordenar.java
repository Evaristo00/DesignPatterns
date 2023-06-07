import java.util.List;

public interface Ordenar {

    /*
    *   <T> indica que se está utilizando un tipo genérico llamado "T".
*       extends Comparable<T> establece una restricción en el tipo genérico "T".
*       Significa que el tipo "T" debe implementar la interfaz Comparable<T>.
*       La interfaz Comparable define un método compareTo que permite comparar dos objetos del mismo tipo y determinar su orden relativo.
    * */

    String nombreMetodo();
    <T extends Comparable<T>> void ordenarLista(List<T> lista);
}
