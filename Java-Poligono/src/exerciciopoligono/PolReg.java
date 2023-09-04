/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoligono;

/**
 *
 * @author mborges
 */
public class PolReg {
    double numLados, tamanhoLado;

    public PolReg(double n, double t) {
        this.numLados = n;
        this.tamanhoLado = t;
    }
    
    public double calcularPerimetro() {
        return numLados * tamanhoLado;
    }
    
    public double calcularAnguloInterno() {
        return ((numLados - 2) * 180) / numLados;
    }
    
    public double calcularArea() {
        return 0;
    }
    
}
