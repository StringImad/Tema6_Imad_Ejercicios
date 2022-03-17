/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.herenciatrabajador_imad;

/**
 *
 * @author imad
 */
public class Camarero extends Trabajador {

    // Único atributo propio de Camarero
    private String rango;

    public Camarero(String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    public Camarero(String rango) {
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }
    @Override
    public void cotizar() {
        System.out.println("Cotizando como camarero");

    }
    
    public void servirMesa(String id){
        System.out.println("Serviendo mesa "+id);
    }
    

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + " Camarero{" + "rango=" + rango + '}';
    }

}
