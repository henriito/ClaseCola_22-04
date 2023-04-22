package org.example;

import EjemploColas.ColaLineal;

public class Main {
    public static void main(String[] args) {
        ColaLineal cl = new ColaLineal();

        try {
            cl.insertar("Andrea");
            cl.insertar(60);
            cl.insertar("cancion.mp3");

            while (!cl.colaVacia())
                System.out.println(cl.Quita());
        }catch (Exception ex){
            System.out.println("Hay molestias: "+ex.getMessage());
        }

        System.out.println("End");
    }
}