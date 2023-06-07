# Patrón de Diseño Decorator - README

Este repositorio contiene un ejemplo de implementación del patrón de diseño Decorator en Java. El patrón Decorator permite agregar funcionalidad adicional a un objeto de forma dinámica, envolviéndolo con objetos decoradores que implementan la misma interfaz.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- `Producto`: Interfaz que define las operaciones comunes para los productos.
- `Telefono`: Clase que implementa la interfaz `Producto` y representa un teléfono.
- `Televisores`: Clase que implementa la interfaz `Producto` y representa un televisor.
- `Laptop`: Clase que implementa la interfaz `Producto` y representa una laptop.
- `ProdDecoratorDescuento`: Clase decoradora que implementa la interfaz `Producto` y agrega funcionalidad de descuento a un producto.

## Uso del Patrón Decorator

En el archivo `Main.java` se encuentra un ejemplo de cómo utilizar el patrón Decorator. Se crea una lista de productos que incluye un objeto de cada tipo: `Laptop`, `Telefono` y `Televisores`. También se muestra un ejemplo de decoración en cascada, donde se aplica el decorador `ProdDecoratorDescuento` dos veces consecutivas a un objeto `Laptop` con diferentes descuentos.


## Explicación del Patrón Decorator

El patrón Decorator se basa en el principio de diseño de composición sobre herencia. Permite agregar funcionalidad a un objeto envolviéndolo en uno o más objetos decoradores. Los decoradores implementan la misma interfaz que el objeto original y encapsulan la funcionalidad adicional.

En este ejemplo, la interfaz `Producto` define las operaciones comunes para todos los productos. Las clases `Telefono`, `Televisores` y `Laptop` implementan esta interfaz y representan diferentes tipos de productos.

El decorador `ProdDecoratorDescuento` implementa también la interfaz `Producto` y agrega la funcionalidad de descuento a un producto. Este decorador recibe un objeto `Producto` y un descuento como parámetros en su constructor. Al llamar al método `getPrecioFinal()`, el decorador aplica el descuento al precio final del producto original y lo retorna.

En el ejemplo del `Main`, se muestra cómo se pueden combinar diferentes productos y decoradores. Además, se destaca que el orden en el que se aplican los decoradores es importante, ya que cada decorador envuelve al objeto anterior.

## Contribuciones

Siéntete libre de contribuir a este proyecto implementando nuevos productos, decoradores o mejorando la estructura existente. Crea un pull request y estaré encantado de revisarlo.

