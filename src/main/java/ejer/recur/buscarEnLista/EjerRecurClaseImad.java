/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer.recur.buscarEnLista;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author imad
 */
public class EjerRecurClaseImad {                                                                                                                                                                                                                                                                                                                                                                     

    public static int numeroEncontar(ArrayList<Integer> lista, int indiceActual, int numeroBuscar) {
       
        if (lista.get(indiceActual) == numeroBuscar) {
            return indiceActual;
        }

        if (indiceActual == lista.size() - 1) {
            return -1;
        } else {
            return numeroEncontar(lista, indiceActual + 1, numeroBuscar);
        }
    }

    public static void main(String[] args) {
        Integer[] listado = {3,2, 4, 1, 7, 3, 5, 7, 9, 4, 7};
        ArrayList<Integer> listadoNumeros = new ArrayList<>(Arrays.asList(listado));


//Si no encuentro el elemento saca -1       
        System.out.println(numeroEncontar(listadoNumeros, 0, 9));

    }
}
