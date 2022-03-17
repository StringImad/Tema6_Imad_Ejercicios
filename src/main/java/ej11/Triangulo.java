/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author imad
 */
public class Triangulo extends Figura{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    @Override
     public double calcularArea() {
        return this.altura * this.base;
    }
}
