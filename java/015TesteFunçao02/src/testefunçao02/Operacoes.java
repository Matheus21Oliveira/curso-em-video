/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefunçao02;

/**
 *
 * @author mathe
 */
public class Operacoes {
    
    public static String contador(int i, int f){
        String s = " ";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;      
    }
}
