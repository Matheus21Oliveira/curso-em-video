package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("pedro", 22, "m"); 
        p[1] = new Pessoa("quezia", 20, "f");
        
        l[0] = new Livro("aprendendo a aprender", "josefino de andrade", 300, p[0]);
        l[1] = new Livro("construção", "marilene de oliveira", 200, p[1]);
        l[2] = new Livro("a internet que pausava", "marco silva da fonseca", 500, p[1]);
        
        System.out.println(l[0].detalhes());
    }
    
}
