# SparkWebApp_AREP_Lab02

## Procfile Changes
* Para pruebas locales en Windows
web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
* Para Heroku
web: java  $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.SparkWebApp

