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
public class CuentaAhorro extends Cuenta {
    
    private double interes;
    private double comisionAnual;
    
    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }
    
    @Override
    void actualiarSaldo() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.interes) - this.comisionAnual);
    }
    
    @Override
    void retirar(double dinero) {
        if (dinero < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - dinero);
        }
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double getComisionAnual() {
        return comisionAnual;
    }
    
    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }
    
    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }
    
}
