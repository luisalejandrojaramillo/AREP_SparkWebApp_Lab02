# SparkWebApp_AREP_Lab02
Esta aplicacion web desplegada en heroku, calcula la Media y la Desviacion Estandar (D.E) de un conjunto de n numeros reales. Estos numeros los ingresaran los uruarios de la aplicacion web.

## Procfile Changes
* Para pruebas locales en Windows
web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
* Para Heroku
web: java  $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.SparkWebApp

## Para probarlo localmente

### Requisitos
* Git
* Java 8
* Maven
* App de Heroku 

### Instalación
1. Abrimos una terminal
2. Clonamos el repositorio
```
https://github.com/luisalejandrojaramillo/AREP_Introduction_Lab01
```
3. Entramos al directorio
```
cd AREP_Introduction_Lab01
```
4. Empaquetamos y corremos las puebas
```
mvn package
```
5. Ejecutamos 
```
java -cp target/Lab01-1.0-SNAPSHOT.jar edu.escuelaing.arep.App
```
6. Heroku local
```
mvn clean install
heroku local web
```

