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
public class Quadrado extends PolReg {
    
    public Quadrado(double t) {
        super(4, t);
    }
    
    @Override
    public double calcularArea() {
        return numLados * tamanhoLado;
    }
    
}
