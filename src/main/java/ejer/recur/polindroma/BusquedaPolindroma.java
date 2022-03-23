/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer.recur.polindroma;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MSI
 */
public class BusquedaPolindroma {

    private static boolean buscarPolindroma(String palabra, int posicion,int contador, String polindroma) {
        System.out.println("Primera letra: " + palabra.charAt(posicion)+" posicion: "+posicion);
        System.out.println("Ultima letra: " + palabra.charAt(palabra.length() - contador)+" posicion: "+ (palabra.length() - contador));      
        if (palabra.charAt(posicion) == palabra.charAt(palabra.length() - contador)||contador==posicion) {
            polindroma += palabra.charAt(posicion) + "";
            System.out.println("Polindroma: "+polindroma);
        }
        if (palabra.equals(polindroma)) {
            System.out.println("Polindroma encontrada");
            return true;
        } else {
            System.out.println("palabra: "+palabra+" posicion: "+posicion+" polindroma: "+polindroma);
            return buscarPolindroma(palabra, (posicion + 1),(contador+1), polindroma);
        }
    }

    public static void main(String[] args) {
        System.out.println("Es polindorma ANA?");
        buscarPolindroma("holaaloh", 0,1, "");
    }
}
