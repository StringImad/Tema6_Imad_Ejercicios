/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.herenciatrabajador_imad;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class Prueba {

    public static void main(String[] args) {
        Camarero c1 = new Camarero("jefe", "Manuel", "Fdez", "1231F");
//        System.out.println(c1);
        Camarero c2 = new Camarero("Ayudante");
//        System.out.println(c2);
        Cocinero c3 = new Cocinero("Postres", "Juan", "pepe", "23343D");
        Cocinero c4 = new Cocinero("Postres", "Fran", "Jime", "231243D");
//        Trabajador t1 = new Trabajador("Pedro", "Fer", "37829232");
//        System.out.println(c3);
//        System.out.println(t1);
//        
//        c1.cotizar();
//        c3.cotizar();
//        t1.cotizar();
//        
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
//        listaTrabajadores.add(t1);

        listaTrabajadores.add(c1);

        listaTrabajadores.add(c3);//Conversion implicita

        for (Trabajador t : listaTrabajadores) {
            System.out.println(t);
            t.cotizar();

            if (t instanceof Camarero) {
                Camarero aux = (Camarero) t;//Conversion explicita
                aux.servirMesa("1223");
            }

            if (t instanceof Cocinero) {
                ((Cocinero) t).prepararPlato("Pucheor");
            }
        }

    }

}
