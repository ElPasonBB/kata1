## Objetivo de la entrega
La entrega tiene como objetivo la automatización del uso del IDE, para incrementar la maniobrabilidad, eficiencia y naturalidad a la hora de programar con el entorno.

## Compilación y ejecución
En el IDE
1. Descargar el proyecto, o clonarlo en IntelliJ u otro IDE de preferencia.
2. Situarse sobre el paquete software.ulpgc.kata1 y ejecutar la clase Main.
   
Usando la terminal:
1. Moverse a la carpeta en la que se ha almacenado la entrega: cd ruta_kata1
2. Compilar los binarios para poder ejecutar: javac -d carpeta_en_la_que_quieres_guardar_los_binarios ./src/main/java/software/ulpgc/kata1/*.java
3. Ejecutar: java -cp bin software.ulpgc.kata1.Main

## Dependencias y versión de JDK
Para esta primera kata se ha utilizado JDK 24, y Maven como gestor.

## Estructura de la entrega y clases principales
En todas las repeticiones, la kata sigue la misma estructura:
- Un paquete software.ulpgc.kata1, donde se encuentran situadas todas las clases de la entrega.
- Una clase de dominio (Person, Student, Task y Activity. En el caso de la entrega final, sería Activity).
- Una clase Main, como forma de ejecutar y probar el correcto funcionamiento de la clase creada.

Todas ellas son record classes, dada la innmutabilidad de los objetos de la clase, y contienen un cálculo derivado de acuerdo con cada repetición.

## Flujo Git usado
El flujo Git consistió durante todo el desarrollo de la kata del salto entre dos ramas: master y develop.
En la rama develop se realizaban los cambios al código, y al terminar y comprobar el correcto funcionamiento de la implementación realizada, se hacía el merge para posteriormente
hacer el push.

Cada repetición de llevó a cabo en una rama develop distinta (develop1, develop2 y develop3, concretamente). Se han subido también al repositorio para facilitar la visualización de la evolución del código
conforme se iban realizando las repeticiones. La última repetición comparte, evidentemente, todos los commits con la rama master, dado el merge que se realizó antes del push.

De todas formas, por si no fuese lo suficientemente claro, se ha indicado en los commits el comienzo de cada una de las repeticiones.

## Clonación del repositorio
El repositorio puede clonarse muy sencillamente dentro de IntelliJ, únicamente dirigiéndonos a la pestaña Git > Clone > Repository URL, e introduciendo el enlace del repositorio, si se tiene ya un proyecto abierto, o haciendo
simplemente click en "Clone repository" en el menú de bienvenida.

## Repeticiones de la kata
Las repeticiones, como se dijo previamente, se llevaron a cabo en ramas diferentes:
- Repetición 1: Person record class, cuyo cálculo derivado consiste en el cálculo de la edad actual a partir de la fecha de nacimiento pasada por parámetro.
- Repetición 2: Student record class, cuyo cálculo derivado consiste en el cálculo de la media de las notas de un semestre del estudiante a partir de un Map pasado por parámetro, siendo que sus pares clave:valor indicaban el nombre de la asignatura y la nota obtenida.
- Repetición 3: Task (posteriormente, Activity) record class, cuyo cálculo derivado consiste en el cálculo del tiempo restante para que termine la tarea a partir de una fecha de finalización pasada por parámetro.

## Evidencias de verificación o pruebas realizadas
Se probó el código utilizando breakpoints (como se puede ver en el vídeo explicativo del final de este README), junto con la clase Main mediante un print por la terminal:

1. Repetición 1:       <img width="358" height="36" alt="imagen" src="https://github.com/user-attachments/assets/5f2ccd78-07ad-49af-8ab5-7e4d7706c4db" />  


2. Repetición 2:       <img width="495" height="39" alt="imagen" src="https://github.com/user-attachments/assets/bfb245b7-65c3-46ec-bbff-0771efbef0a4" />  


3. Repetición 3:       <img width="269" height="33" alt="imagen" src="https://github.com/user-attachments/assets/4b0245b3-7bae-406c-a0b1-04e7ba17040c" />  

## Shortcuts utilizados
1. Ctrl + K: Commit
2. Ctrl + Shift + K: Push
3. Alt + Enter: Sugerencias
4. Alt + Insert: Generate, genera elementos y código según el contexto
5. Ctrl + Tab: Switcher (cambiar entre elementos de la interfaz y menús)
6. Alt + 1: Cambiar al árbol del proyecto
7. Alt + 9: Cambiar a Git
8. Shift + F10: Ejecutar
9. Shift + F9: Depurador
10. Shift + F6: Renombrar
11. psvm: public static void main
12. sout: System.out.println();

## Enlace al vídeo explicativo
https://drive.google.com/file/d/13h3_lLG6ss15AuXXU0ddBLn84PKccXLP/view?usp=sharing
