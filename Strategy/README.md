# Implementación del patrón de diseño Strategy

Este proyecto de ejemplo muestra la implementación del patrón de diseño Strategy en Java. El patrón Strategy permite encapsular diferentes algoritmos o estrategias en clases separadas, permitiendo cambiar y seleccionar la estrategia en tiempo de ejecución sin modificar el código cliente.

## Estructura del proyecto

El proyecto consta de las siguientes clases:

- `Ordenar`: Es una interfaz que define los métodos comunes para todas las estrategias de ordenación.
- `BubbleSort`, `InsertionSort`, `SelectionSort`, `QuickSort`: Son clases que implementan la interfaz `Ordenar` y proporcionan algoritmos de ordenación específicos.
- `Context`: Es la clase que utiliza una estrategia de ordenación. Permite cambiar la estrategia en tiempo de ejecución.
- `Main`: Es la clase principal que demuestra el uso del patrón de diseño Strategy. Se crean instancias de diferentes estrategias de ordenación y se mide el tiempo de ejecución de cada una.

## Uso del patrón de diseño Strategy

1. Definir la interfaz común: Crea una interfaz (`Ordenar`) que declare los métodos comunes para todas las estrategias de ordenación. En este ejemplo, el método `ordenarLista(List<T> lista)` realiza la ordenación de la lista.

2. Implementar estrategias específicas: Crea clases que implementen la interfaz `Ordenar` y proporcionen algoritmos de ordenación específicos. En este ejemplo, las clases `BubbleSort`, `InsertionSort`, `SelectionSort` y `QuickSort` implementan diferentes algoritmos de ordenación.

3. Utilizar el contexto: Crea una clase (`Context`) que utilice la estrategia de ordenación. Esta clase tiene un método `executeStrategy(ArrayList<Integer> arrayList)` que invoca el método `ordenarLista()` de la estrategia seleccionada.

4. Cliente: En el código cliente, crea una instancia del contexto (`Context`) y establece la estrategia deseada utilizando el método `setEstategia()`. Luego, llama al método `executeStrategy()` para realizar la ordenación utilizando la estrategia seleccionada.

## Ejecución del ejemplo

El archivo `Main.java` contiene un ejemplo de uso del patrón de diseño Strategy. Se crean instancias de diferentes estrategias de ordenación (`BubbleSort`, `InsertionSort`, `SelectionSort`, `QuickSort`) y se mide el tiempo de ejecución de cada estrategia utilizando el método `caluloTiempoDeEjecucion()`.

Para ejecutar el ejemplo, sigue los siguientes pasos:

1. Compila el archivo `Main.java` utilizando el comando `javac Main.java`.
2. Ejecuta el archivo `Main.class` utilizando el comando `java Main`.

Observarás que se imprimirá el nombre de cada método de ordenación y el tiempo de ejecución medido en nanosegundos.

Este ejemplo demuestra cómo el patrón de diseño Strategy permite cambiar fácilmente la estrategia de ordenación sin modificar el código cliente. Simplemente cambia la estrategia asignada al contexto y el resultado de la ordenación se ajustará automáticamente.