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

    private static boolean buscarPolindroma(String palabra, int posicion, String polindroma) {
        System.out.println("Primera letra: " + palabra.charAt(palabra.length() - 1));
        System.out.println("Ultima letra: " + palabra.charAt(posicion));

        System.out.println("Posicion: " + posicion);
        System.out.println("Posicion del otro lado: " + (palabra.length() - 1));
        
        if (palabra.charAt(posicion) == palabra.charAt(palabra.length() - 1)) {
            polindroma += palabra.charAt(posicion) + "";
        }
        System.out.println("Polindroma: " + polindroma);
        if (palabra.equals(polindroma)) {
            return false;
        } else {
            return buscarPolindroma(palabra, (posicion + 1), polindroma);
        }
    }

    public static void main(String[] args) {
        System.out.println("Es polindorma ANA?");
        buscarPolindroma("ANA", 0, "");
    }
}
