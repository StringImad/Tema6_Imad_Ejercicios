/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer.recur.iamd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author imad
 */
public class EjerRecurClaseImad {
//     public static void recorridoRecursivo(ArrayList<Integer> lista, int indiceActual) {
//        //Caso base
//        if (indiceActual == lista.size() - 1) {
//            System.out.println("Ultimo elemento: " + lista.get(indiceActual));
//        } else {
//            System.out.println("Elemento: " + lista.get(indiceActual));
//            recorridoRecursivo(lista, indiceActual + 1);
//        }
//    }

    public static int numeroEncontar(ArrayList<Integer> lista, int indiceActual, int contador, int numeroBuscar) {
       
        if (lista.get(indiceActual) == numeroBuscar) {
            return indiceActual;
        }

        if (indiceActual == lista.size() - 1) {
            return -1;
        } else {
            return numeroEncontar(lista, indiceActual + 1, contador, numeroBuscar);
        }
    }

    public static void main(String[] args) {
        Integer[] listado = {3,2, 4, 1, 7, 3, 5, 7, 9, 4, 7};
        ArrayList<Integer> listadoNumeros = new ArrayList<>(Arrays.asList(listado));


//Si no encuentro el elemento saca -1       
        System.out.println(numeroEncontar(listadoNumeros, 0,0, 3));

    }
}
