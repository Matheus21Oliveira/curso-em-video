/*
Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 
8 + 10 + 12 + 14 + ... + 98 + 100.
 */
package exercicio46;

import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String r;
        int s = 0, n;
        do {
            System.out.print("digite um numero para somarmos: ");
            n = teclado.nextInt();

            s += n;

            System.out.print("quer continuar? [S/N] ");
            r = teclado.next();
        
        }  while (r.equals("s"));
            System.out.println("a some de todos os valores foi " + s);
    }

}
