package Decorator;

import productos.Producto;

public class ProdDecoratorDescuento implements Producto {

    private Producto producto;
    private Integer descuento;

    public ProdDecoratorDescuento(Producto producto, Integer descuento) {
        this.producto = producto;
        this.descuento = descuento;
    }

    @Override
    public void mostrarInfo() {
        producto.mostrarInfo();
    }

    @Override
    public double getPrecioFinal() {
        double montoDescuento = this.producto.getPrecioFinal() * (descuento / 100.0);
        return this.producto.getPrecioFinal() - montoDescuento;
    }
}
