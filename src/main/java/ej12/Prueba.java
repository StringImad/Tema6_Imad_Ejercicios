/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "1234243S", "Calle 1");
        Cuenta c1 = new CuentaAhorro(2, 1.4, p1);
        
        System.out.println(c1);

    }
}
