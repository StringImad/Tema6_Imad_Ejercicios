/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author imad
 */
public class Principal {

    public static void main(String[] args) {

        Direccion d1 = new Direccion("calle A", 3);
        Direccion d2 = new Direccion("calle B", 7);
        Persona p = new Persona("pepe", 20);
        p.setDirección(d1);
        Empresa e = new Empresa();
        e.setCif("1A");
        e.setDirección(d2);

        System.out.println(p.getDirección().getCalle());
        System.out.println(e.getDirección().getCalle());
    }
}
