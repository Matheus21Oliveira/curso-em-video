/*
 Faça um programa que leia 7 números inteiros e no final mostre o somatório 
entre eles.
 */
package exercicio48;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s = 0, n = 0;
        
        while (s<7) {
            System.out.println("escolha alguns numeros: ");
            s = teclado.nextInt();
            ;
        }        
    }
    
}
