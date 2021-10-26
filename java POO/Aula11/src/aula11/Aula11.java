package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("marquinhos");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno al = new Aluno();
        al.setNome("rafael");
        al.setIdade(15);
        al.setSexo("M");
        al.setMatricula(15);
        al.setCurso("informatica");
        System.out.println(al.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(16);
        b1.setNome("francisco");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();  
    }
    
}
