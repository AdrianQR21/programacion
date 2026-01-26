### Arquitectura del Proyecto

*   **`com.juego.presentacion`**: Se encarga de la interfaz de usuario. Muestra toda la información en pantalla y recoge las entradas del jugador.
*   **`com.juego.modelo`**: Contiene el núcleo del juego. Incluye la clase `personaje` (datos) y `combate` (reglas y lógica de la pelea).
*   **`com.juego.razas`**: Define las plantillas para los distintos tipos de personajes (`Guerrero`, `Mago`, etc.), estableciendo sus estadísticas y habilidades iniciales.
*   **`com.juego.habilidades`**: Contiene todas las acciones posibles que un personaje puede ejecutar, como `AtaqueFuerte` o `Curar`.
*   **`com.juego.Main`**: Es el punto de entrada que crea los objetos de las otras capas y da inicio al juego.

--------------------------------

### Funcionamiento del Sistema

*   **Inicialización**: El programa `com.juego.Main` crea los personajes y el objeto `combate`.
*   **Bucle de Juego**: Se inicia un ciclo `while` que se mantiene activo mientras ambos personajes tengan vida.
*   **Acción del Jugador**: En cada turno, el jugador activo ve la lista de habilidades y elige cuál usar.
*   **Resolución**: La habilidad se ejecuta, modificando la vida del objetivo.
*   **Finalización**: Cuando la vida de un personaje llega a cero, el bucle termina y se anuncia al ganador.

--------------------------------


### Combate por Turnos

*   **Sistema de Alternancia**: Los jugadores realizan acciones uno después del otro de forma estricta.
*   **Fases del Turno**: Cada turno se compone de tres pasos: mostrar información, elección del jugador y ejecución de la habilidad.
*   **Recurso Estratégico**: El número limitado de `usos` de cada habilidad es el principal elemento táctico, obligando a gestionar cuándo usar las acciones más poderosas.
*   **Objetivo Automático**: El sistema determina el objetivo de la habilidad: el propio lanzador si es una cura, o el oponente si es un ataque.

--------------------------------


### Balance del juego

*   **Balance por Estadísticas**: El juego se equilibra ajustando los atributos base de cada `raza` (vida, ataque, defensa).
*   **Balance por Habilidades**: El poder de una habilidad se mide por su efecto (daño/curación) y, sobre todo, por su número de `usos`. Habilidades más fuertes son más limitadas.
*   **Diseño Asimétrico**: Se busca que cada `raza` tenga fortalezas y debilidades claras contra otras, promoviendo la diversidad estratégica y evitando que una clase sea la mejor en todo.
