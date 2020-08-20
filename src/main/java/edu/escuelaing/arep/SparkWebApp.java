package edu.escuelaing.arep;

import edu.escuelaing.arep.Math.Estadistica;
import edu.escuelaing.arep.Math.LinkedList;
import spark.Request;
import spark.Response;

import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/", (req, res) -> mainPage(req, res));
        get("/calc", (req, res) -> mainPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }

    private static  String mainPage(Request req, Response res){
        String content = "<!DOCTYPE html>" + "<html>" + "<body>"
                + "<center>"
                + "<h1>Calculadora</h1>"
                + "<form action=\"/results\">"
                + "Este sitio web resuelve Promedio y desviacion estandar"
                + "<h2>Insertar Datos</h2>"
                + "Los datos deben estar deparados por coma (,)<br>"
                + "  <input type=\"text\" name=\"data\" placeholder=\"Ej. 1,2.3,4.9\">" + "<br/><br/>"
                + "  <input type=\"submit\" value=\"Submit\">" + "</form>"
                + "</center>"
                + "</body>" + "</html>";
        return content;

    }

    private static String resultsPage(Request req, Response res) {
        String a[] = req.queryParams("data").split(",");
        LinkedList dataList = new LinkedList();
        for (String string : a) {
            LinkedList.newNode(dataList,Double.parseDouble(string));
        }
        double mean = Estadistica.resMedia(dataList);
        double standard = Estadistica.resDesviacionEstandar(dataList);

        String pageContent = "<!DOCTYPE html>" + "<html>" + "<body>"
                + "<center>" + "<h2>Resultados</h2>"
                + "<h3> Promedio: " + mean + "</h3>"
                + "<h3> Desviacion Estandar: " + standard + "</h3>"
                + "</center>" + "</body>" + "</html>";
        return pageContent;
    }
}