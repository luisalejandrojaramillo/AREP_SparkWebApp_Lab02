package edu.escuelaing.arep.Math;


public class LinkedList {
    // Creamos la cabeza de la lista
    Node head;
    /**
     * Creamos la clase del Nodo la cual inicializamos y creamos contructor
     */
    public static class Node {
        final double numeros;
        Node next;
        Node(double dat){
            next=null;numeros=dat;
        }
    }

    /**
     * Para añadir un nodo a la lista encadenada (LinkedList)
     * @param list (LinkedList)
     * @param numeros (Double)
     */
    public static void newNode(LinkedList list,double numeros){
        Node node = new Node(numeros);
        node.next = null;
        if(list.head==null){
            list.head=node;
        }else{
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next=node;
        }
    }

}
