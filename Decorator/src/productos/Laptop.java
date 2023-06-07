package productos;

public class Laptop implements Producto{

    private Double precio;

    public Laptop(Double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.print("esto es una productos.Laptop.");
    }

    @Override
    public double getPrecioFinal() {
        return precio;
    }
}
