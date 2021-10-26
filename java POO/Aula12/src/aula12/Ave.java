package aula12;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo alpiste");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }
    
    public void fazerNinho() {
        System.out.println("construiu um ninho");
    }
}
