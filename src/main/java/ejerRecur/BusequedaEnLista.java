/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerRecur;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MSI
 */
public class BusequedaEnLista {
    //Recorrido recursivo ejemplo aprenderaprogramar.com

    public static void recorridoRecursivo(ArrayList<Integer> lista, int indiceActual) {
        //Caso base
        if (indiceActual == lista.size() - 1) {
            System.out.println("Ultimo elemento: " + lista.get(indiceActual));
        } else {
            System.out.println("Elemento: " + lista.get(indiceActual));
            recorridoRecursivo(lista, indiceActual + 1);
        }
    }

    public static int numeroDeSietes(ArrayList<Integer> lista, int indiceActual, int contador) {
        if (lista.get(indiceActual) == 7) {
            return indiceActual;
        }

        if (indiceActual == lista.size() - 1) {
            return contador;
        } else {
            return numeroDeSietes(lista, indiceActual + 1, contador);
        }
    }

    public static void main(String[] args) {
        Integer[] listado = {3, 4, 1, 7, 3, 5, 7, 9, 4, 7};
        ArrayList<Integer> listadoNumeros = new ArrayList<Integer>(Arrays.asList(listado));

        System.out.println("listadoNumeros contiene " + listadoNumeros);
        System.out.println("RECORRIDO SIN BUCLES (RECURSIVO)");
        recorridoRecursivo(listadoNumeros, 0);
//        System.out.println("RECORRIDO SIN BUCLES (RECURSIVO) CONTANDO ELEMENTOS QUE CUMPLEN UNA CONDICIÓN");
//        System.out.println("El número de sietes en la lista es " + numeroDeSietes(listadoNumeros, 0, 0));
    }
}
