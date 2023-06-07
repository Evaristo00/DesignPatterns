package productos;

public class Telefono implements Producto{

    private Integer tamañoPantalla;
    @Override
    public void mostrarInfo() {
        System.out.print("esto es un telefono");
    }

    @Override
    public double getPrecioFinal() {
        return 1000;
    }
}
