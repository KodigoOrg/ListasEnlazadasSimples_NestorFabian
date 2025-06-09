# Lista Enlazada Simple

Este documento proporciona detalles sobre la implementación de una lista enlazada simple, incluyendo su estructura, cómo compilar y ejecutar el código, y las pruebas unitarias realizadas.
Estructura de la Lista Enlazada

## La implementación consta de dos componentes principales:

    Nodo: Esta es la estructura fundamental de la lista enlazada. Cada Nodo contiene:
        valor: El dato que almacena el nodo (en este caso, un entero).
        siguiente: Un puntero al siguiente Nodo en la secuencia. Si es el último nodo de la lista, este puntero es NULL.

    ListaEnlazada: Esta estructura gestiona la colección de Nodos. Contiene:
        cabeza: Un puntero al primer Nodo de la lista. Si la lista está vacía, este puntero es NULL.

## Los métodos principales implementados para la ListaEnlazada son:

    insertarAlFinal(int valor): Añade un nuevo nodo con el valor especificado al final de la lista.
    eliminarPorValor(int valor): Busca y elimina la primera ocurrencia del valor especificado en la lista.
    buscar(int valor): Busca un valor específico en la lista y retorna true si lo encuentra, false en caso contrario.
    mostrar(): Imprime los valores de todos los nodos en la lista, en orden.
    ~ListaEnlazada(): El destructor de la clase, responsable de liberar toda la memoria asignada dinámicamente para los nodos, evitando fugas de memoria.

## Instrucciones para Compilar y Ejecutar el Código

    Guarde el código: Asegúrese de que el código de la lista enlazada (por ejemplo, lista_enlazada.java) esté guardado en su sistema.

## Descripción de las Pruebas Unitarias Realizadas y Resultados Esperados

Se han implementado una serie de pruebas unitarias dentro de la función main() para verificar la correcta funcionalidad de la lista enlazada. A continuación, se detallan las pruebas y los resultados esperados:

    Inicialización de la lista:
        Acción: Crear una instancia de ListaEnlazada.
        Resultado esperado: La lista debe estar vacía (cabeza NULL).

    insertarAlFinal():
        Acción: Insertar varios elementos (e.g., 10, 20, 30) al final de la lista.
        Resultado esperado: La lista debe contener los elementos en el orden de inserción: 10 -> 20 -> 30.

    mostrar():
        Acción: Llamar a mostrar() en la lista después de las inserciones.
        Resultado esperado: La salida debe ser: "Lista: 10 -> 20 -> 30 -> NULL".

    buscar():
        Acción:
            Buscar un elemento existente (e.g., 20).
            Buscar un elemento no existente (e.g., 99).
        Resultado esperado:
            Para 20: "20 encontrado en la lista."
            Para 99: "99 no encontrado en la lista."

    eliminarPorValor():
        Acción:
            Eliminar un elemento del medio (e.g., 20).
            Eliminar un elemento que no existe (e.g., 50).
            Eliminar el primer elemento (e.g., 10).
            Eliminar el último elemento (e.g., 30).
        Resultado esperado:
            Después de eliminar 20: Lista: 10 -> 30 -> NULL.
            Después de intentar eliminar 50: Mensaje indicando que 50 no fue encontrado, lista sin cambios.
            Después de eliminar 10: Lista: 30 -> NULL.
            Después de eliminar 30: Lista vacía: NULL.

    Comportamiento del destructor:
        Acción: El programa termina.
        Resultado esperado: Toda la memoria asignada dinámicamente para los nodos debe ser liberada correctamente, sin fugas de memoria. Esto se verifica implícitamente si el programa finaliza sin errores de memoria reportados por herramientas de depuración (como Valgrind, si se usaran).

## Observaciones Relevantes sobre la Implementación

    Gestión de Memoria: La implementación utiliza new para asignar memoria para cada nodo y delete en el destructor de la ListaEnlazada para liberar esa memoria. Es crucial que el destructor se llame automáticamente cuando el objeto ListaEnlazada sale de ámbito o se elimina explícitamente, para prevenir fugas de memoria.
    Manejo de la Cabeza (cabeza): La lógica de los métodos (insertarAlFinal, eliminarPorValor) debe manejar correctamente los casos donde la lista está vacía (es decir, cabeza es NULL) o cuando las operaciones afectan al primer nodo de la lista.
    Eficiencia:
        Las operaciones de inserción al final (insertarAlFinal) requieren recorrer la lista hasta el último nodo, lo que resulta en una complejidad de tiempo de O(n), donde n es el número de elementos en la lista. Si se necesitara una inserción al final más eficiente, se podría mantener un puntero al último nodo.
        Las operaciones de búsqueda (buscar) y eliminación por valor (eliminarPorValor) también tienen una complejidad de tiempo de O(n) en el peor de los casos, ya que pueden requerir recorrer toda la lista.
    Simplicidad: Esta implementación se centra en la claridad y la comprensión básica de las listas enlazadas. Para aplicaciones más complejas, se podrían considerar listas doblemente enlazadas o listas circulares para optimizar ciertas operaciones.
