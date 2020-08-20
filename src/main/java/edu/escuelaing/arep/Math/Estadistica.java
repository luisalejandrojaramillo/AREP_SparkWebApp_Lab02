package edu.escuelaing.arep.Math;

/**
 * Aca se van a hacer los calculos estadisticos correspondinetes
 */
public class Estadistica {

    /**
     * @param list (LinkedList)
     * @return Media
     */
    public static double resMedia(LinkedList list){
        double media;
        // El primero
        LinkedList.Node node = list.head;
        // Inicializamos en 0 para los calculos
        double suma = 0;
        int veces = 0;
        // Recorremos hasta que sea vacio
        while (node!=null){
            suma+=node.numeros;
            node=node.next;
            veces+=1;
        }
        // Formula de Media
        media = suma/veces;
        media = (double)Math.round(media * 100d) / 100d;
        return media;
    }

    /**
     * @param list (LinkedList)
     * @return Desviacion Estandar
     */
    public static double resDesviacionEstandar(LinkedList list){
        double desv;
        // Primero sacamos la Media
        double media = resMedia(list);
        // El primero
        LinkedList.Node node = list.head;
        // Inicializamos en 0 para los calculos
        double suma = 0;
        int veces = 0;
        // Recorremos hasta que sea vacio
        while (node!= null){
            suma += Math.pow((node.numeros)-media,2);
            veces+=1;
            node=node.next;
        }
        // Formula de D.E
        desv = Math.sqrt(suma/(veces-1));
        desv = (double)Math.round(desv * 100d) / 100d;
        return desv;
    }
}
