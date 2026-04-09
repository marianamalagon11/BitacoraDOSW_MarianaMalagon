# Refuerzo – Análisis de requerimientos (Parte 1)

## Escenario 1: Plataforma de Batallas Bakugan

### 1. Identificación de requerimientos

**Requerimientos funcionales:**
1. El sistema debe permitir a los usuarios registrarse y autenticarse.
2. El sistema debe permitir a los usuarios coleccionar criaturas Bakugan.
3. El sistema debe permitir a los usuarios mejorar (evolucionar) sus criaturas Bakugan.
4. El sistema debe permitir a los usuarios gestionar su inventario de criaturas y habilidades.
5. El sistema debe permitir enfrentamientos estratégicos entre jugadores.
6. El sistema debe garantizar que los combates no sean en tiempo real, pero sí consistentes en resultados.
7. El sistema debe permitir emparejamientos justos entre jugadores.
8. El sistema debe almacenar y mantener la información de las partidas (persistencia).
9. El sistema debe permitir la evolución futura para integrar eventos especiales, rankings y modos cooperativos.

**Requerimientos no funcionales:**
10. El sistema debe ser escalable para soportar nuevas funcionalidades en el futuro.
11. El sistema debe garantizar la seguridad de la información de los usuarios y partidas.
12. El sistema debe ser fácil de mantener y evolucionar.
13. El sistema debe asegurar la integridad y consistencia de los datos almacenados.
14. El sistema debe tener alta disponibilidad para los usuarios.

### 2. Clasificación y justificación

| ID  | Requerimiento                                                                 | Tipo         | Justificación                                                                 |
|-----|-------------------------------------------------------------------------------|--------------|------------------------------------------------------------------------------|
| RF1 | El sistema debe permitir a los usuarios registrarse y autenticarse.           | Funcional    | Es una acción que el usuario realiza en el sistema.                          |
| RF2 | El sistema debe permitir a los usuarios coleccionar criaturas Bakugan.        | Funcional    | Es parte del objetivo principal del sistema.                                 |
| RF3 | El sistema debe permitir a los usuarios mejorar sus criaturas Bakugan.        | Funcional    | Es una funcionalidad clave para la progresión.                               |
| RF4 | El sistema debe permitir gestionar inventario de criaturas y habilidades.      | Funcional    | Permite la administración de recursos del usuario.                           |
| RF5 | El sistema debe permitir enfrentamientos estratégicos entre jugadores.        | Funcional    | Es el núcleo del sistema de juego.                                           |
| RF6 | El sistema debe garantizar combates no en tiempo real pero consistentes.      | Funcional    | Define la mecánica de combate y su consistencia.                             |
| RF7 | El sistema debe permitir emparejamientos justos entre jugadores.              | Funcional    | Asegura la equidad en el juego.                                              |
| RF8 | El sistema debe almacenar y mantener la información de las partidas.          | Funcional    | Permite la persistencia y recuperación de datos.                             |
| RF9 | El sistema debe permitir evolución para integrar nuevas funcionalidades.       | Funcional    | Permite la adaptabilidad del sistema.                                        |
| RNF1| El sistema debe ser escalable.                                                | No funcional | Permite soportar crecimiento y nuevas funciones.                             |
| RNF2| El sistema debe garantizar la seguridad de la información.                    | No funcional | Protege datos sensibles de usuarios y partidas.                              |
| RNF3| El sistema debe ser fácil de mantener y evolucionar.                          | No funcional | Facilita cambios futuros y corrección de errores.                            |
| RNF4| El sistema debe asegurar la integridad y consistencia de los datos.           | No funcional | Evita errores y corrupción de información.                                   |
| RNF5| El sistema debe tener alta disponibilidad.                                    | No funcional | Asegura acceso continuo para los usuarios.                                   |

### 3. Redacción correcta de requerimientos

- El sistema debe permitir a los usuarios registrarse y autenticarse mediante credenciales únicas.
- El sistema debe permitir a los usuarios coleccionar criaturas Bakugan, agregándolas a su inventario personal.
- El sistema debe permitir a los usuarios mejorar sus criaturas Bakugan, incrementando sus habilidades y estadísticas.
- El sistema debe permitir a los usuarios gestionar su inventario de criaturas y habilidades, incluyendo agregar, eliminar y organizar elementos.
- El sistema debe permitir enfrentamientos estratégicos entre jugadores, calculando resultados de manera consistente y justa.
- El sistema debe garantizar que los combates no sean en tiempo real, pero que los resultados sean reproducibles y consistentes.
- El sistema debe permitir emparejamientos justos entre jugadores, considerando nivel, habilidades y estadísticas.
- El sistema debe almacenar y mantener la información de las partidas, permitiendo su consulta y recuperación posterior.
- El sistema debe permitir la integración futura de eventos especiales, rankings y modos cooperativos sin afectar funcionalidades existentes.
- El sistema debe ser escalable para soportar un aumento en la cantidad de usuarios y funcionalidades.
- El sistema debe garantizar la seguridad de la información de los usuarios y partidas mediante mecanismos de autenticación y autorización.
- El sistema debe ser fácil de mantener y evolucionar, utilizando buenas prácticas de desarrollo y documentación.
- El sistema debe asegurar la integridad y consistencia de los datos almacenados, evitando duplicidad y corrupción.
- El sistema debe tener alta disponibilidad, minimizando tiempos de inactividad.

### 4. Priorización

| ID   | Prioridad | Justificación                                                                 |
|------|-----------|------------------------------------------------------------------------------|
| RF1  | Alta      | Sin autenticación no hay acceso al sistema.                                   |
| RF2  | Alta      | Es el objetivo principal del sistema.                                         |
| RF3  | Media     | Es importante para la progresión, pero depende de la colección.               |
| RF4  | Alta      | Esencial para la gestión de recursos del usuario.                             |
| RF5  | Alta      | Núcleo del sistema, sin combates no hay juego.                                |
| RF6  | Alta      | Define la experiencia de juego y su consistencia.                             |
| RF7  | Alta      | Fundamental para la equidad y satisfacción del usuario.                       |
| RF8  | Alta      | Sin persistencia no hay continuidad ni historial.                             |
| RF9  | Media     | Permite adaptabilidad, pero no es crítico para el MVP.                        |
| RNF1 | Media     | Importante para el crecimiento, pero no crítico en la primera versión.        |
| RNF2 | Alta      | Protege datos sensibles, esencial para la confianza del usuario.              |
| RNF3 | Media     | Facilita el mantenimiento, pero no afecta la funcionalidad inicial.           |
| RNF4 | Alta      | Sin integridad, el sistema puede fallar o perder datos.                       |
| RNF5 | Media     | Importante para experiencia, pero puede mejorar progresivamente.              |

### 5. Dependencias y bloqueos

- RF3 depende de RF2 (no se puede mejorar criaturas sin antes coleccionarlas).
- RF5 depende de RF1, RF2, RF4 (para combatir, el usuario debe estar autenticado, tener criaturas y gestionarlas).
- RF6 depende de RF5 (no hay combates si no existe la mecánica de enfrentamiento).
- RF7 depende de RF5 y RF4 (para emparejar, debe haber jugadores y datos de inventario).
- RF8 depende de RF5 (no hay partidas que almacenar si no hay combates).
- RF9 depende de la arquitectura y modularidad del sistema.
- RNF1, RNF3 y RNF5 dependen de la arquitectura y buenas prácticas desde el inicio.
- Bloqueos: Falta de definición formal de reglas de combate, balance de criaturas y criterios de emparejamiento.

### 6. Matriz de trazabilidad

| ID   | Tipo         | Módulo/Caso de uso         | Prueba/Validación                                      |
|------|--------------|---------------------------|--------------------------------------------------------|
| RF1  | Funcional    | Autenticación             | Registro e inicio de sesión exitoso                    |
| RF2  | Funcional    | Inventario                | Agregar criatura al inventario                         |
| RF3  | Funcional    | Mejora de criaturas       | Mejorar criatura y verificar cambio de estadísticas    |
| RF4  | Funcional    | Inventario                | Agregar/eliminar/organizar elementos                   |
| RF5  | Funcional    | Combate                   | Simular combate y validar resultado                    |
| RF6  | Funcional    | Combate                   | Repetir combate y obtener mismo resultado              |
| RF7  | Funcional    | Emparejamiento            | Emparejar jugadores con niveles similares              |
| RF8  | Funcional    | Persistencia              | Recuperar historial de partidas                        |
| RF9  | Funcional    | Integración futura        | Añadir nueva función sin afectar existentes            |
| RNF1 | No funcional | Arquitectura              | Pruebas de carga y escalabilidad                       |
| RNF2 | No funcional | Seguridad                 | Pruebas de acceso y protección de datos                |
| RNF3 | No funcional | Mantenimiento             | Facilidad para modificar o añadir código               |
| RNF4 | No funcional | Base de datos             | Pruebas de integridad y consistencia de datos          |
| RNF5 | No funcional | Infraestructura           | Pruebas de disponibilidad y tolerancia a fallos        |

### 7. Análisis de ambigüedades

1. **Balance entre criaturas y habilidades:** No se especifica cómo se logrará el balance ni qué métricas se usarán.
2. **Criterios de emparejamiento justo:** No se define qué variables se consideran para emparejar jugadores (nivel, estadísticas, etc.).
3. **Persistencia de información:** No se detalla qué información debe persistirse (solo partidas, también inventario, historial, etc.).

**Otros aspectos ambiguos:**
- No se especifica el tipo de base de datos ni tecnologías a utilizar.
- No se define el flujo exacto de combate ni las reglas detalladas.
- No se aclara si los usuarios pueden tener múltiples cuentas o solo una.

### 8. Conclusión

Este análisis permite sentar las bases para el desarrollo del sistema, identificando requerimientos claros, dependencias, bloqueos y vacíos de información que deben ser validados con el cliente antes de avanzar a etapas de diseño y desarrollo.
