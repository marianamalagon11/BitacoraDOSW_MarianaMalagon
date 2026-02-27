# Semana 1
## Ejercicio 1: Números pares mayores a 10
## Lista de ejemplo:
List<Integer> numbers = List.of(3,8,10,12,15,18,20);
## Resultado:
![img_1.png](images/img_1.png)

## Ejercicio 2: Palabras con más de 4 letras, en mayúsculas y ordenadas alfabéticamente.
#### También la cantidad de palabras
## Lista de ejemplo:
List<String> words = List.of("java", "stream", "api", "functional", "code", "git");
## Resultado:
![img_2.png](images/img_2.png)

## Ejercicio 3: Dada lista de usuarios con id, nombre, edad y estado (activo/inactivo),obtener el nombre de los usuarios activos en mayúsculas y en orden alfábetico
## Lista de ejemplo:
![img_4.png](images/img_4.png)
## Resultado:
![img_3.png](images/img_3.png)

## Ejercicio 4: Dada una lista de usuarios con id, nombre, categoría y precio, obtener el nombre de los adultos
## Lista de ejemplo:
![img_4.png](images/img_4.png)


## Resultado:
![img_5.png](images/img_5.png)

## Ejercicio 5: Dada una lista de transacciones bancarias representadas por objetos Se requiere procesar la lista usando Streams para:
Usar peek para ver cada transacción procesada (Utilizar System.out.println para ver la transaccion)
Verificar si existe al menos una transacción no aprobada
Retornar true o false indicando si el lote de transacciones es válido.
## Lista de ejemplo:
![img_6.png](images/img_6.1.png)

## Resultado:
![img_7.png](images/img_7.png)

### Reflexión:

¿Qué entendía mal antes?

No sabía del uso de streams en Java, ni de sus métodos como filter, map, sorted, peek, anyMatch, etc. No tenía claro cómo encadenar operaciones para procesar colecciones de datos de manera eficiente y legible.

¿Qué entiendo ahora?

Ahora entiendo que los Streams en Java son una herramienta poderosa para procesar colecciones de datos de manera funcional. Puedo usar métodos como filter para filtrar elementos, map para transformar datos, sorted para ordenar, peek para inspeccionar el flujo de datos, y anyMatch para verificar condiciones. Esto me permite escribir código más limpio y eficiente al trabajar con listas y otras colecciones.

¿Qué me falta reforzar?

Me falta reforzar la práctica con Streams para familiarizarme más con sus métodos y cómo combinarlos de manera efectiva. También quiero profundizar en el rendimiento de los Streams y cómo optimizar su uso en diferentes escenarios.
