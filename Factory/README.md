# Idea del Proyecto: Patrón de Diseño Factory

Este proyecto tiene como objetivo practicar la implementación del patrón de diseño Factory en Java.

## Descripción

El patrón de diseño Factory es un patrón creacional que proporciona una interfaz común para crear objetos, pero permite a las subclases decidir qué clase concreta instanciar. En lugar de que el código cliente cree directamente objetos, utiliza métodos de la fábrica para obtener las instancias necesarias.

En este proyecto, implementaremos el patrón de diseño Factory para crear instancias de diferentes tipos de hamburguesas. La fábrica de hamburguesas será responsable de la creación de las instancias, ocultando la lógica de creación al código cliente.

## Características

- Utilización del patrón de diseño Factory para crear instancias de hamburguesas.
- Creación de una clase abstracta `Hamburguesas` con el método `preparar()` que representa la acción de preparar una hamburguesa.
- Implementación de diferentes clases concretas que estienden de la clase `Hamburguesa`, como `BigMac` y `Cuarto de libra`.
- Creacion de la interfaz `cocinar` la cual representa la interfaz para hacer las distinas fabriacas
- Las clases `CocinarCuartoDeLibra` y `CocinarBigMac` implmentan `Cocinar` y funcionan como la fábrica para crear instancias de hamburguesas según el tipo especificado.
- en el main esta ele ejemplo de código cliente que utiliza la fábrica para crear instancias de hamburguesas y llamar al método `preparar()` en cada una de ellas.

