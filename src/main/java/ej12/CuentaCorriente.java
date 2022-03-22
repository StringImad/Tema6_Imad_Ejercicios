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
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente(double interes, double saldoMin, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.saldoMin = saldoMin;
    }

    @Override
    void actualiarSaldo() {
        if (this.getSaldo() >= 1000) {
            this.setSaldo(this.getSaldo() + (this.saldoMin * this.interes));

        } else {
            this.setSaldo(this.getSaldo() + (this.saldoMin + this.interes));

        }
    }

    @Override
    void retirar(double dinero) {
        double dineroRetirar;
        if (dinero < this.getSaldo()) {
            dineroRetirar = this.getSaldo() - dinero;
            if (dineroRetirar <= this.saldoMin) {
                this.setSaldo(dineroRetirar);

            }
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + " CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }

}
