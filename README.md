#TRABAJO N° 6: TEST UNITARIO
Este es un Trabajo Práctico para Ingeniería de Software. Dejamos este README para poder explciar el procedimiento para poder probar los Test Unitarios creados.

Integrantes:
-Angulo, Renzo
-Céspedes, Rodrigo
-Fernandez, Renzo
-Fernandez, Valentin
-Flores, Sebastian
-Girala, Ramses
-Pepi, Martín

Para poder correr los tests necesitamos:
-IntelliJ IDEA Community Edition 2021.1.3
-Java JDK v11
-Maven Respository
  -Lombok v1.18.20
  -Spring Rest Docs v2.0.5
  -Spring Boot v2.5.5

Para poder probar este trabajo, hemos creado en la dirección src/test/java/com/ingsoft 2 capertas llamadas Entities y Testing. En la primera carpeta hemos creado clases, representando objetos, para poder trabajar y basarnos a la hora de hacer los testing. En la segunda carpeta, encontraremos varias clases funcionales que son los test que hemos creado.

Dentro de cada clase encontraremos uno o varios tests. Estos tests van a estar en común con el nombre de la clase, es decir, que cada clase posee un nombre señalando una de las clases objeto y testeamos con funciones una o varias condiciones seleccionada con anterioridad. 

Para poder probar los test, tendremos que clonar el repositorio o descargar el zip. Lo descomprime en el lugar que desee dentro de la pc, y abrimos Intellij. Dentro de del IDE procederemos a abrir el archivo. Una vez que nos carga el proyecto, nos dirigimos a la carpeta src/test/java/com/ingsoft/testing y tendremos todos los tests creados. Se selecciona el test unitario que se desee probar y hacemos click derecho y seleccinamos Run 'Nombre del archivo' o `Ctrl+Mayus+F10`. En la parte inferior nos mostrar los resultados del test.
