package aula10;

public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Professor();
        Pessoa p4 = new Funcionario();
        
        p1.setNome("pedro");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");
        
        p1.setSexo("m");
        p4.setSexo("f");
        p2.setIdade(18);
        
        p2.setCurso("informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
