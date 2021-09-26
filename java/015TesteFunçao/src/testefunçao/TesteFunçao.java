/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefunçao;

/**
 *
 * @author mathe
 */
public class TesteFunçao {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("começou o programa!");
        int sm = soma(5,2);
        System.out.println("a soma vale " + sm);
    }
    
}
