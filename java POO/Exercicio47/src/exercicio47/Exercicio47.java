/*
Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0
 */
package exercicio47;

import java.util.Scanner;

public class Exercicio47 {
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
