# BitacoraDOSW_MarianaMalagon
# REPASO TEORÍA DOSW – PRIMER CORTE

---

# Flujo de ramas

feature → develop → release → main

---

#  ESTRUCTURAS DE DATOS

## Array
- Tamaño fijo.
- Permite tipos primitivos.
- Acceso rápido por índice `[]`.
- Complejidad acceso: O(1).

## ArrayList
- Tamaño dinámico.
- Almacena objetos.
- Métodos principales:
  - `add()`
  - `remove()`
  - `size()`

## HashMap
- Estructura clave–valor.
- Claves únicas.
- Valores pueden repetirse.
- Permite `null`.

## Hashtable
- Similar a HashMap.
-  No permite `null`.

##  HashSet
- Colección de elementos únicos.
- No mantiene orden.
- Permite un solo `null`.
- Complejidad O(1).

## TreeSet
- Elementos ordenados automáticamente.
-  No permite `null`.
- Complejidad O(log n).

---

#  STRINGS

##  String
- Inmutable.
- Cada modificación crea un nuevo objeto en memoria.

##  StringBuilder
- Mutable.
- No crea nuevo objeto al modificar.

##  StringBuffer
- Igual que StringBuilder.
- Sincronizado (thread-safe).

---

#  PROGRAMACIÓN FUNCIONAL

- Evaluación de funciones matemáticas.
- Evita cambios de estado.
- Evita mutabilidad.
- Enfoque declarativo: describe qué se quiere lograr, no cómo.

## Funciones puras
- Mismo input → mismo output.

## Funciones de orden superior
- Reciben funciones como argumento.
- Devuelven funciones.

---

#  STREAM()
<img width="556" height="164" alt="image" src="https://github.com/user-attachments/assets/5b27f49e-1792-42f9-bea4-161734fe5dcc" />


Convierte colección en flujo de datos para procesar.

## Operaciones Intermedias
- `filter()` → filtra por condición.
- `map()` → transforma cada elemento.
- `distinct()` → elimina duplicados.
- `sorted()` → ordena.
- `limit(n)` → limita cantidad.
- `skip(n)` → salta primeros n.
- `peek()` → depuración.
- `min()`
- `max()`

## Operaciones Terminales
- `forEach()` → ejecuta acción.
- `collect()` → convierte en colección.
- `count()` → cuenta elementos.
- `reduce()` → reduce a un valor.
- `anyMatch()` → true si alguno cumple.
- `allMatch()` → true si todos cumplen.
- `noneMatch()` → true si ninguno cumple.
- `toList()`

---

#  SOLID

## Single Responsibility
Una clase debe tener una sola responsabilidad.

## Encapsulamiento
Ocultar detalles internos mediante:
- `public`
- `private`
- `protected`

## Open/Closed
Abierto para extensión.
Cerrado para modificación.

## Polimorfismo
Objetos de distintas subclases tratados como instancia de superclase.

### Overloading
Mismo método con distintas firmas.

### Overriding
Método sobrescrito en subclase.

## Clase abstracta
Se usa con `extends`.

## Interfaces
Se usan con `implements`.

## Liskov Substitution
Subclases deben poder sustituir a superclases sin alterar comportamiento.

## Inmutabilidad
Objeto no puede modificarse tras crearse.

## Interface Segregation
No obligar a clientes a depender de interfaces que no usan.

## Dependency Inversion
Depender de abstracciones, no implementaciones concretas.

---

#  ACOPLAMIENTO Y COHESIÓN

## Acoplamiento
Grado de dependencia entre unidades de software.

## Cohesión
Grado en que los elementos trabajan unidos hacia un mismo objetivo.

---

#  PATRONES DE DISEÑO

## 🟦 Creacionales
- **Factory Method** → Interfaz para crear objetos.
  <img width="767" height="580" alt="image" src="https://github.com/user-attachments/assets/3613d4d6-8feb-487d-95bc-c804612ebf4a" />

- **Abstract Factory** → Produce familias de objetos relacionados.
  <img width="684" height="526" alt="image" src="https://github.com/user-attachments/assets/69f62a9c-1e21-4763-8020-fabe9d606021" />

- **Builder** → Construcción paso a paso.
 <img width="576" height="590" alt="image" src="https://github.com/user-attachments/assets/aa7e1011-3299-47d7-a968-386877b3152b" />

- **Prototype** → Copia objetos existentes.
  <img width="825" height="628" alt="image" src="https://github.com/user-attachments/assets/a962bd61-61f9-48ce-8039-76268e07f7fd" />

- **Singleton** → Una única instancia.
  <img width="684" height="459" alt="image" src="https://github.com/user-attachments/assets/c565240f-67fc-4bb6-bed9-10ee7e61af23" />


## 🟩 Estructurales
- **Adapter** → Interfaces incompatibles.
  <img width="740" height="577" alt="image" src="https://github.com/user-attachments/assets/8deee0a2-dce3-43a4-9faa-6d7587165988" />

- **Bridge** → Divide clase grande en clases relacionadas.
  <img width="672" height="492" alt="image" src="https://github.com/user-attachments/assets/107e1932-43a8-41ad-a12e-758cd2ee6d08" />

- **Composite** → Estructura en árbol.
  <img width="889" height="500" alt="image" src="https://github.com/user-attachments/assets/e44b764c-6f33-4223-b66f-73d3f21a3eb6" />

- **Decorator** → Agrega comportamiento envolviendo objetos.
  <img width="921" height="623" alt="image" src="https://github.com/user-attachments/assets/94afd2e7-f59a-4bc6-9e32-c467dc978df4" />

- **Facade** → Interfaz simplificada.
- **Flyweight** → Optimiza memoria.
- **Proxy** → Sustituto de otro objeto.
  <img width="921" height="448" alt="image" src="https://github.com/user-attachments/assets/62b4dae6-9162-41db-8600-eb750bab122c" />


## 🟪 Comportamiento
- **Chain of Responsibility** → Cadena de manejadores.
  <img width="565" height="496" alt="image" src="https://github.com/user-attachments/assets/543d8767-4f24-46ec-8a84-cbbec503fea1" />

- **Command** → Solicitud convertida en objeto.
  <img width="693" height="431" alt="image" src="https://github.com/user-attachments/assets/c362a341-f0ca-477a-844b-3bd949012e27" />

- **Iterator** → Recorrer colección sin exponer estructura.
  <img width="530" height="421" alt="image" src="https://github.com/user-attachments/assets/a762ed17-e5eb-455c-910f-3bbb7d37faad" />

- **Mediator** → Reduce dependencias.
  <img width="670" height="556" alt="image" src="https://github.com/user-attachments/assets/9101b7a8-c0d0-4b1f-8c28-0120e65892b5" />

- **Memento** → Guardar/restaurar estado.
  <img width="570" height="303" alt="image" src="https://github.com/user-attachments/assets/6441cff3-f26a-425a-9f43-6e74e9c7a968" />

- **Observer** → Notificación de cambios.
  <img width="554" height="285" alt="image" src="https://github.com/user-attachments/assets/11dfcc15-a04c-43a3-bd9d-abcc8c1e5b76" />

- **State** → Cambia comportamiento según estado.
  <img width="657" height="487" alt="image" src="https://github.com/user-attachments/assets/94aeead0-b08e-4155-915c-8da181124f19" />

- **Strategy** → Algoritmos intercambiables.
  <img width="378" height="304" alt="image" src="https://github.com/user-attachments/assets/8d6bcb26-a282-4b10-8ef2-5af440400980" />

- **Template Method** → Esqueleto de algoritmo.
  <img width="380" height="386" alt="image" src="https://github.com/user-attachments/assets/63375f9b-196a-4cf5-bd3d-22a05b057183" />

- **Visitor** → Separar algoritmos de objetos.
  <img width="439" height="430" alt="image" src="https://github.com/user-attachments/assets/2d4dc11a-e5a0-4d32-85f6-174a5cf322ac" />


---

# 🔹 MODELO C4

Modelo jerárquico para describir arquitectura.

## Niveles
1. Contexto
2. Contenedores
3. Componentes
4. Código

### Diagrama de Contexto
- Azul/Amarillo → Sistema a construir.
- Rojo → Sistema existente.
- Verde → Persona/usuario.

---

# 🔹 ANÁLISIS DE REQUERIMIENTOS

## Definición
Condición o característica que debe cumplir un sistema.

## Tipos
- **Funcionales** → Lo que hace el sistema.
- **No funcionales** → Propiedades del sistema.

## Documento incluye:
- Código
- Nombre
- Descripción
- Actor principal
- Precondiciones
- Datos de entrada
- Datos de salida
- Flujo básico
- Flujo alterno
- Anexos

---

# 🔹 DIAGRAMA DE CASOS DE USO

Permite visualizar:
- Actores
- Casos de uso
- Sistema
- Paquetes

Estructura: Cómo, quiero, porque.

---

# 🔹 PROTOTIPOS

## Mockup
Representación visual de interfaz.

## Flujo funcional
Secuencia de pantallas y acciones.

---

# 🔹 UX / UI

## UX
Experiencia del usuario.

## UI
Interfaz visual.

## Heurísticas de Nielsen
Principios de usabilidad (1995).

---

# 🔹 MATRIZ DE TRAZABILIDAD

Incluye:
- ID
- Nombre
- Cliente responsable
- Prioridad
- Estado
- Equipo responsable

---

# 🔹 USABILIDAD
Diseño orientado a satisfacción del usuario.

---

# 🔹 MANUAL DE IDENTIDAD
Estándares visuales y verbales de marca.

---

# 🔹 BENCHMARKING VISUAL
Análisis de competidores y mejores prácticas.

---

# 🔹 GUÍAS DE ESTILO
Reglas y estándares visuales para coherencia.

---

# 🔹 UX WRITING
Definición de textos adecuados en herramientas digitales.

---

# 🔹 WATERFALL

Modelo secuencial:

1. Requirements  
2. Design  
3. Implementation  
4. Verification  
5. Maintenance  

---

# 🔹 METODOLOGÍAS ÁGILES

Capacidad de responder al cambio.

## Manifiesto Ágil (17 febrero 2001)
Valora:
- Individuos
- Software funcionando
- Colaboración con cliente
- Respuesta al cambio

---

# 🔹 SCRUM

Marco basado en empirismo.

## Empirismo
Decisiones basadas en observación y experimentación.

## Pilares
- Transparencia
- Inspección
- Adaptación

## Valores
- Coraje
- Enfoque
- Compromiso
- Respeto
- Apertura

## Roles
- Scrum Master
- Product Owner
- Scrum Team

## Artefactos
- Product Backlog
- Sprint Backlog
- Product Increment

---

# 🔹 ATRIBUTOS DE CALIDAD

- Funcionalidad
- Performance
- Compatibilidad
- Usabilidad
- Fiabilidad
- Seguridad
- Portabilidad
- Mantenibilidad

---

# 🔹 NIVELES DE DESCOMPOSICIÓN DEL TRABAJO

## Épica
Objetivo amplio de negocio.

## Feature
Funcionalidad concreta que aporta valor.

## Historia de Usuario
Unidad pequeña desde perspectiva del usuario.

## Tarea
Acción técnica específica.
