/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.herenciatrabajador_imad;

/**
 *
 * @author imad
 */
public class Cocinero extends Trabajador {

    private String partida;

    public Cocinero(String partida) {
        this.partida = partida;
    }

    public Cocinero(String partida, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return super.toString() + " Cocinero{" + "partida=" + partida + '}';
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizando como cocinero");

    }

    public void prepararPlato(String plato) {
        System.out.println("cocinero preparando " + plato);

    }

}
