
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(1);
        cb1.setDono("jubileu nascimento da silva");
        cb1.abrirConta("cc");
        
        ContaBanco cb2 = new ContaBanco();
        cb2.setNumConta(2);
        cb2.setDono("creuza passos dias aguiar");
        cb2.abrirConta("cp");
        
        cb1.depositar(300);
        cb2.depositar(500);
        
        cb2.sacar(100);
        
        cb1.estadoAtual();   
        cb2.estadoAtual(); 
    }
    
}
