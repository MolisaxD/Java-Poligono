/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoligono;

import java.util.Scanner;

/**
 *
 * @author mborges
 */
public class ExercicioPoligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escolha o tipo de polígono a criar: ");
        System.out.println("1) Triângulo Equilátero");
        System.out.println("2) Quadrado");
        System.out.println("3) Sair");
        
        Scanner read = new Scanner(System.in);
        switch (read.nextInt()) {
            case 1:
                TrianguloEq delta = new TrianguloEq(3, 9);
                System.out.println("Perímetro: " + delta.calcularPerimetro());
                System.out.println("Ângulo interno: " + delta.calcularAnguloInterno());
                System.out.println("Área: " + delta.calcularArea());
            break;
            case 2:
                Quadrado tetra = new Quadrado(9.8);
                System.out.println("Perímetro: " + tetra.calcularPerimetro());
                System.out.println("Ângulo interno: " + tetra.calcularAnguloInterno());
                System.out.println("Área: " + tetra.calcularArea());
            break;
            default:
                
            break;
        }
    }
    
}
