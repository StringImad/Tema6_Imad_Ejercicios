/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class PruebaLegislador {

    public static void main(String[] args) {
        Legislador l1 = new Senador(100, "Malaga", "pp", "Juan", "Fernandez");
        Legislador l2 = new Senador(200, "Sevilla", "psoe", "Mario", "Jimenez");
        Legislador l3 = new Diputado(3, "Madrid", "podemos", "pablo", "iglesias");
        Legislador l4 = new Diputado(4, "Valencia", "vox", "Santiago", "Abascal");

        ArrayList<Legislador> lista = new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);

        for (Legislador t : lista) {
            System.out.println(t);

            if (t instanceof Senador) {
                Senador aux = (Senador) t;//Conversion explicita
                System.out.println(aux.getCamaraEnQueTrabaja());
            }

            if (t instanceof Diputado) {
                System.out.println(((Diputado) t).getCamaraEnQueTrabaja());
            }
        }

    }
}
