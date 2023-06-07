package productos;

public class Televisores implements Producto{

    private Integer pulgadas;

    public Televisores(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarInfo() {
        System.out.print("Esto es un televisor");
    }

    @Override
    public double getPrecioFinal() {
        return 8000;
    }
}
