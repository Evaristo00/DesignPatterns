import Decorator.ProdDecoratorDescuento;
import productos.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> l = List.of(new Laptop(5000.0),new Telefono(),
                new Televisores(75), new ProdDecoratorDescuento(new ProdDecoratorDescuento(new Laptop(5000.0), 50),-50));

        l.forEach(producto -> {
            producto.mostrarInfo();
            System.out.println("  El precio es: "+ producto.getPrecioFinal());
            if (producto instanceof Televisores)
                System.out.println("\t las pulgadas son: " +((Televisores) producto).getPulgadas());
        });
    }
}