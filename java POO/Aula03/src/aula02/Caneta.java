
package aula02;


public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;  
    void status () {
        System.out.println("modelo " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("esta tampada? " + this.tampada);
    }
    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Nâo posso rabiscar.");
        } else {
            System.out.println("estou rabiscando");
        }
    } 
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar () {
        this.tampada = false;
    }
}
